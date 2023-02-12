package org.testing.Triggers;

import java.io.IOException;

import org.testing.testCases.TC1_PostRequest;
import org.testing.testCases.TC2_GetRequest;
import org.testing.testCases.TC3_GetParticularRecord;
import org.testing.testCases.TC4_UpdateRecord;
import org.testing.testCases.TC5_DeleteRequest;
import org.testing.testCases.TC6_DummyPostRequest;
import org.testing.testCases.TC7_DummyGetRequestAll;
import org.testing.testCases.TC8_GetParticularFromDummy;

public class Runner {

	public static void main(String[] args) throws IOException {
		TC1_PostRequest ob1=new TC1_PostRequest();
		ob1.PostRequest();
		TC2_GetRequest ob2=new TC2_GetRequest();
		ob2.GetRequest();
		
		TC3_GetParticularRecord ob3=new TC3_GetParticularRecord();
		ob3.testCase3();
		TC4_UpdateRecord ob4=new TC4_UpdateRecord();
		ob4.UpdateRequest();
		TC5_DeleteRequest ob5=new TC5_DeleteRequest();
		ob5.testCase5();
		TC6_DummyPostRequest ob6=new TC6_DummyPostRequest();
		ob6.PostRequest();
		
		TC7_DummyGetRequestAll ob7=new TC7_DummyGetRequestAll();
		ob7.GetRequest();
		
		TC8_GetParticularFromDummy ob8=new TC8_GetParticularFromDummy();
		ob8.TC8();

	}

}
