import java.util.HashMap;

import com.pacificmetrics.automatedscoring.service.configuration.ConfigUtil;


public class TestExpressionEvaluatorModule extends TestScoringModule {

	public Program program;
	public Item item;
	
	public void loadHashMap(final String fileDir, final Item item, int order, Program program, String itemIdOfTemplate, String newItemParams) {
		
		moduleInputData.put("fileDirectory", fileDir);
		moduleInputData.put("item", item);
		moduleInputData.put("order", order);
		moduleInputData.put("program", program);
		moduleInputData.put("itemIdOfTemplate", itemIdOfTemplate);
		moduleInputData.put("newItemParams", newItemParams);
		
			
	}
	
	public void process() {
		
	}
	@Override
	public void validateHashMapInput(HashMap<String, Object> moduleInputData)
	{
		
		if ((moduleInputData.get("item")!=null) && (Item.class.isInstance(moduleInputData.get("item")))) {
		// write to log, throw exception
			break;
		} 
		else if () ...
		
	}
	@Override
	public void loadConfig(HashMap<String, Object> modelInputData) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void loadParams() {
		
	}
	
}
