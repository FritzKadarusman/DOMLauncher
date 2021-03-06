package com.phonegap;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaPlugin;

import android.os.Environment;
import android.util.Log;

public class Simplefile extends CordovaPlugin {

	@Override
	   public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		
		if(action.equals("saveFile")){
			try {
				String path = args.getJSONObject(0).getString("file");
				String content = args.getJSONObject(0).getString("content");
				
				File myFile = new File(path);
				myFile.createNewFile();
				FileOutputStream fOut = new FileOutputStream(myFile);
				  
				OutputStreamWriter myOutWriter = new OutputStreamWriter(fOut);
				myOutWriter.write(content);
				myOutWriter.close();
				fOut.close();
				callbackContext.success(new JSONObject().put("returnVal", "File Saved"));
			} catch (JSONException e) {
				callbackContext.success(new JSONObject().put("returnVal", "JSON_EXCEPTION"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(action.equals("openFile")){

			try {
				String path = args.getJSONObject(0).getString("file");
				FileInputStream is = new FileInputStream(path);
				int size = is.available();
				byte[] buffer = new byte[size];
				is.read(buffer);
				is.close();
				String text = new String(buffer);
				Log.d(id, "Open:" + text);
				callbackContext.success(new JSONObject().put("returnVal", text));
			} catch (IOException e) {
				// TODO Auto-generated catch block	
				e.printStackTrace();
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} 
		
		if(action.equals("domodList")){
			File sdcard = Environment.getExternalStorageDirectory();
			File f = new File(sdcard,"/DOMLauncher/DOMods");
			File[] files = f.listFiles();
			JSONArray jArray = new JSONArray();
		
			for (File inFile : files) {
			    if (inFile.isDirectory()) {		    	
			    	String[] folderName = inFile.toString().split("/");			
			    	String lastItem = folderName[folderName.length - 1];					    							
					jArray.put(lastItem);
			    }
			}
			callbackContext.success(new JSONObject().put("returnVal", jArray));
			
		}		
		return true;
	}
}
