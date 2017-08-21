/*
 * GENERATED FILE
 * Created on Wed Aug 09 11:56:09 BST 2017
 *
 */
package org.nrg.xdat.bean;
import org.apache.log4j.Logger;
import org.nrg.xdat.bean.base.BaseElement;

import java.util.*;

/**
 * @author XDAT
 *
 *//*
 ******************************** 
 * DO NOT MODIFY THIS FILE 
 *
 ********************************/
@SuppressWarnings({"unchecked","rawtypes"})
public class IcrPreclinicaldemographicdataBean extends XnatSubjectassessordataBean implements java.io.Serializable, org.nrg.xdat.model.IcrPreclinicaldemographicdataI {
	public static final Logger logger = Logger.getLogger(IcrPreclinicaldemographicdataBean.class);
	public static final String SCHEMA_ELEMENT_NAME="icr:preclinicalDemographicData";

	public String getSchemaElementName(){
		return "preclinicalDemographicData";
	}

	public String getFullSchemaElementName(){
		return "icr:preclinicalDemographicData";
	}

	//FIELD

	private String _Species=null;

	/**
	 * @return Returns the species.
	 */
	public String getSpecies(){
		return _Species;
	}

	/**
	 * Sets the value for species.
	 * @param v Value to Set.
	 */
	public void setSpecies(String v){
		_Species=v;
	}

	//FIELD

	private String _Genotype=null;

	/**
	 * @return Returns the genotype.
	 */
	public String getGenotype(){
		return _Genotype;
	}

	/**
	 * Sets the value for genotype.
	 * @param v Value to Set.
	 */
	public void setGenotype(String v){
		_Genotype=v;
	}

	//FIELD

	private String _Tumourtype=null;

	/**
	 * @return Returns the tumourType.
	 */
	public String getTumourtype(){
		return _Tumourtype;
	}

	/**
	 * Sets the value for tumourType.
	 * @param v Value to Set.
	 */
	public void setTumourtype(String v){
		_Tumourtype=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("species")){
			setSpecies(v);
		}else if (xmlPath.equals("genotype")){
			setGenotype(v);
		}else if (xmlPath.equals("tumourType")){
			setTumourtype(v);
		}
		else{
			super.setDataField(xmlPath,v);
		}
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setReferenceField(String xmlPath,BaseElement v) throws BaseElement.UnknownFieldException{
			super.setReferenceField(xmlPath,v);
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public Object getDataFieldValue(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("species")){
			return getSpecies();
		}else if (xmlPath.equals("genotype")){
			return getGenotype();
		}else if (xmlPath.equals("tumourType")){
			return getTumourtype();
		}
		else{
			return super.getDataFieldValue(xmlPath);
		}
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public Object getReferenceField(String xmlPath) throws BaseElement.UnknownFieldException{
			return super.getReferenceField(xmlPath);
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public String getReferenceFieldName(String xmlPath) throws BaseElement.UnknownFieldException{
			return super.getReferenceFieldName(xmlPath);
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("species")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("genotype")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("tumourType")){
			return BaseElement.field_data;
		}
		else{
			return super.getFieldType(xmlPath);
		}
	}

	/**
	 * Returns arraylist of all fields
	 */
	public ArrayList getAllFields() {
		ArrayList all_fields=new ArrayList();
		all_fields.add("species");
		all_fields.add("genotype");
		all_fields.add("tumourType");
		all_fields.addAll(super.getAllFields());
		return all_fields;
	}


	public String toString(){
		java.io.StringWriter sw = new java.io.StringWriter();
		try{this.toXML(sw,true);}catch(java.io.IOException e){}
		return sw.toString();
	}


	public void toXML(java.io.Writer writer,boolean prettyPrint) throws java.io.IOException{
		writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		writer.write("\n<icr:PreclinicalDemographicData");
		TreeMap map = new TreeMap();
		map.putAll(getXMLAtts());
		map.put("xmlns:arc","http://nrg.wustl.edu/arc");
		map.put("xmlns:cat","http://nrg.wustl.edu/catalog");
		map.put("xmlns:icr","http://nrg.wustl.edu/icr");
		map.put("xmlns:pipe","http://nrg.wustl.edu/pipe");
		map.put("xmlns:prov","http://www.nbirn.net/prov");
		map.put("xmlns:scr","http://nrg.wustl.edu/scr");
		map.put("xmlns:val","http://nrg.wustl.edu/val");
		map.put("xmlns:wrk","http://nrg.wustl.edu/workflow");
		map.put("xmlns:xdat","http://nrg.wustl.edu/security");
		map.put("xmlns:xnat","http://nrg.wustl.edu/xnat");
		map.put("xmlns:xnat_a","http://nrg.wustl.edu/xnat_assessments");
		map.put("xmlns:xsi","http://www.w3.org/2001/XMLSchema-instance");
		java.util.Iterator iter =map.keySet().iterator();
		while(iter.hasNext()){
			String key = (String)iter.next();
			writer.write(" " + key + "=\"" + map.get(key) + "\"");
		}
		int header = 0;
		if (prettyPrint)header++;
		writer.write(">");
		addXMLBody(writer,header);
		if (prettyPrint)header--;
		writer.write("\n</icr:PreclinicalDemographicData>");
	}


	protected void addXMLAtts(java.io.Writer writer) throws java.io.IOException{
		TreeMap map = this.getXMLAtts();
		java.util.Iterator iter =map.keySet().iterator();
		while(iter.hasNext()){
			String key = (String)iter.next();
			writer.write(" " + key + "=\"" + map.get(key) + "\"");
		}
	}


	protected TreeMap getXMLAtts() {
		TreeMap map = super.getXMLAtts();
		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		//REFERENCE FROM preclinicalDemographicData -> subjectAssessorData
		if (_Species!=null){
			writer.write("\n" + createHeader(header++) + "<icr:species");
			writer.write(">");
			writer.write(ValueParser(_Species,"string"));
			writer.write("</icr:species>");
			header--;
		}
		if (_Genotype!=null){
			writer.write("\n" + createHeader(header++) + "<icr:genotype");
			writer.write(">");
			writer.write(ValueParser(_Genotype,"string"));
			writer.write("</icr:genotype>");
			header--;
		}
		if (_Tumourtype!=null){
			writer.write("\n" + createHeader(header++) + "<icr:tumourType");
			writer.write(">");
			writer.write(ValueParser(_Tumourtype,"string"));
			writer.write("</icr:tumourType>");
			header--;
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Species!=null) return true;
		if (_Genotype!=null) return true;
		if (_Tumourtype!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
