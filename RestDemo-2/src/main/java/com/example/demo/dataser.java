package com.example.demo;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.philips.services.iot.commondatamodel.iothttpmodel.HttpMethodType;
import com.philips.services.iot.commondatamodel.iothttpmodel.IoTHttpRequest;
import com.philips.services.iot.commondatamodel.iothttpmodel.IoTHttpRequestBuilder;
import com.philips.services.iot.commondatamodel.iothttpmodel.IoTHttpResponse;
import com.philips.services.iot.httpclient.clientimpl.HttpAbstraction;
import com.philips.services.iot.httpclient.exception.IoTHttpException;
import com.philips.services.iot.httpclient.exception.IoTHttpNetworkException;
import com.philips.services.iot.httpclient.factory.HttpClientFactory;

/*import javax.xml.crypto.Data;
*/
import org.springframework.stereotype.Component;

@Component
public class dataser {
	HttpClientFactory factory;
	HttpAbstraction abstraction;
	IoTHttpRequest request;
	IoTHttpResponse response;
	String requestString;

	/*
	 * private void initialisation() { factory = new HttpClientFactory();
	 * abstraction = factory.getHttpClientInstance(); }
	 */
private  List<edata> list= new ArrayList<>();

//get all edata
public List<edata> getalldata(){
	return list;
}
//get single edata
public edata getdatabyid(int id) {
	edata obj=null;
	obj=list.stream().filter(e->e.getId()==id).findFirst().get();
	return obj;
}
//adding edata
public edata adddata(edata ed)  {
	list.add(ed);
	return ed;
}
//delete data
public void deldata(int id) throws IoTHttpException, IoTHttpNetworkException {
	list=list.stream().filter(edata->edata.getId()!=id).collect(Collectors.toList());

}
//update data
public void updatdata(edata ed, int id) {
	list.stream().map(b->{
		if(b.getId()==id){
		b.setName(ed.getName());
		b.setSalary(ed.getSalary());
	}
	return b;
	}).collect(Collectors.toList());
	

}
String deleteMethod(String currentUrl, int id) throws IoTHttpException, IoTHttpNetworkException {
	request = new IoTHttpRequestBuilder().httpMethod(HttpMethodType.DELETE)//
					.requestUrl(currentUrl + id).build();
			response = abstraction.sendHttpRequest(request);
			return (response.getHttpResponseAsString());
			// getMethod();
		}

String putMethod(String currentUrl,edata ed,int id)
throws IoTHttpException, IoTHttpNetworkException, JsonProcessingException {
		requestString = "{ \"id\":\"" + ed.getId() + "\", \"name\":\"" + ed.getName() //
+ "\", \"department\":\"" + ed.getDepartment()  + "\"}";
		/* ObjectMapper mapper = new ObjectMapper(); */ 
		request = new IoTHttpRequestBuilder().httpMethod(HttpMethodType.PUT)
.requestUrl(currentUrl + id).requestBody(requestString).build();
		response = abstraction.sendHttpRequest(request);
		return (response.getHttpResponseAsString());
		// getMethod();
	}

}


 