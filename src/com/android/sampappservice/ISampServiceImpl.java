package com.android.sampappservice;
 
import android.util.Log;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.sampservice.*;
 
class ISampServiceImpl extends ISampService.Stub {
  public static String TAG = "ISampServiceImpl";

  public int add(int a,int b) {
	  int c = a + b;
	  Log.d (TAG, "Addition: " + a + " + " + b + " = " + c);
	  return c;                           
  }
 
  public int sub(int a,int b) {
	  int c = a - b;
	  Log.d (TAG, "Substraction: " + a + " - " + b + " = " + c);
	  return c;
  }
}

