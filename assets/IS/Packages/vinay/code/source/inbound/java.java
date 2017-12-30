package inbound;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2017-12-29 15:23:10 IST
// -----( ON-HOST: KELLHYDCPU001

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class java

{
	// ---( internal utility methods )---

	final static java _instance = new java();

	static java _newInstance() { return new java(); }

	static java _cast(Object o) { return (java)o; }

	// ---( server methods )---




	public static final void new_javaService (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(new_javaService)>> ---
		// @sigtype java 3.5
		// [i] field:0:required input1
		// [i] field:0:required input2
		// [o] field:0:required output1
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String  input1 = IDataUtil.getString( pipelineCursor, "input1" );
		String  input2 = IDataUtil.getString( pipelineCursor, "input2" );
		pipelineCursor.destroy();
		
		String output1 = "hello, you gave me " + input1 +" and " + input2;
		Integer addValue = Integer.valueOf(input1) + Integer.valueOf(input2) ;
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "output1", output1 );
		IDataUtil.put( pipelineCursor_1, "add result", addValue );
		pipelineCursor_1.destroy();
			
		// --- <<IS-END>> ---

                
	}
}

