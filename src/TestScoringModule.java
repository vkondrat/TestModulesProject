import java.util.HashMap;
import java.util.Map;

public abstract class TestScoringModule extends TestProcessingModule{
	
	//I don't need getter/setter for modelInputData?
	public Map<String,Object> moduleInputData = new HashMap<String,Object>();

	// Checks if HashMap contains correct data for the particular module
	public abstract void validateHashMapInput(HashMap<String, Object> moduleInputData);
	
	public abstract void loadConfig(HashMap<String, Object> modelInputData); // передавать hashmap сюда
	
	public abstract void loadParams(); // Sashe mogno eto ne posylat'

}
