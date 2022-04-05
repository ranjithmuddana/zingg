package zingg;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import zingg.client.ZinggClientException;
import zingg.client.ZinggOptions;

public abstract class FindAndLabeller<S,D,R,C,T1,T2> extends Labeller<S,D,R,C,T1,T2> {
	protected static String name = "zingg.FindAndLabeller";
	public static final Log LOG = LogFactory.getLog(FindAndLabeller.class);

	private TrainingDataFinder<S,D,R,C,T1,T2> finder;

	public FindAndLabeller() {
		setZinggOptions(ZinggOptions.FIND_AND_LABEL);		
	}

	
	@Override
	public void execute() throws ZinggClientException {
		finder.execute();
		super.execute();
	}
}
