package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class dataser {
private static List<edata> list= new ArrayList<>();
static {
	list.add(new edata(100,"Ankush","CSE",2434345));
	list.add(new edata(101,"Anirudh","IOT-RSM",2434345));
	list.add(new edata(102,"Achyut","IOTHub",2434345));
	list.add(new edata(103,"Harsha","IOTHub",2434345));
	list.add(new edata(104,"Samriddhi","IOTA",2434345));
	list.add(new edata(105,"Shreevidya","IOTA",2434345));
}
//get all edata
public List<edata> getalledata(){
	return list;
}
//get single edata
public edata getedatabyid(int id) {
	edata obj=null;
	obj=list.stream().filter(e->e.getEid()==id).findFirst().get();
	return obj;
}
//adding data
public void addbook(edata ed) {
	list.add(ed);
}
}
