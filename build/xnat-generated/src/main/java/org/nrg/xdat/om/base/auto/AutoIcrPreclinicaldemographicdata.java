/*
 * GENERATED FILE
 * Created on Wed Aug 09 11:56:09 BST 2017
 *
 */
package org.nrg.xdat.om.base.auto;
import org.apache.log4j.Logger;
import org.nrg.xft.*;
import org.nrg.xft.security.UserI;
import org.nrg.xdat.om.*;
import org.nrg.xft.utils.ResourceFile;
import org.nrg.xft.exception.*;

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
public abstract class AutoIcrPreclinicaldemographicdata extends XnatSubjectassessordata implements org.nrg.xdat.model.IcrPreclinicaldemographicdataI {
	public static final Logger logger = Logger.getLogger(AutoIcrPreclinicaldemographicdata.class);
	public static final String SCHEMA_ELEMENT_NAME="icr:preclinicalDemographicData";

	public AutoIcrPreclinicaldemographicdata(ItemI item)
	{
		super(item);
	}

	public AutoIcrPreclinicaldemographicdata(UserI user)
	{
		super(user);
	}

	/*
	 * @deprecated Use AutoIcrPreclinicaldemographicdata(UserI user)
	 **/
	public AutoIcrPreclinicaldemographicdata(){}

	public AutoIcrPreclinicaldemographicdata(Hashtable properties,UserI user)
	{
		super(properties,user);
	}

	public String getSchemaElementName(){
		return "icr:preclinicalDemographicData";
	}
	 private org.nrg.xdat.om.XnatSubjectassessordata _Subjectassessordata =null;

	/**
	 * subjectAssessorData
	 * @return org.nrg.xdat.om.XnatSubjectassessordata
	 */
	public org.nrg.xdat.om.XnatSubjectassessordata getSubjectassessordata() {
		try{
			if (_Subjectassessordata==null){
				_Subjectassessordata=((XnatSubjectassessordata)org.nrg.xdat.base.BaseElement.GetGeneratedItem((XFTItem)getProperty("subjectAssessorData")));
				return _Subjectassessordata;
			}else {
				return _Subjectassessordata;
			}
		} catch (Exception e1) {return null;}
	}

	/**
	 * Sets the value for subjectAssessorData.
	 * @param v Value to Set.
	 */
	public void setSubjectassessordata(ItemI v) throws Exception{
		_Subjectassessordata =null;
		try{
			if (v instanceof XFTItem)
			{
				getItem().setChild(SCHEMA_ELEMENT_NAME + "/subjectAssessorData",v,true);
			}else{
				getItem().setChild(SCHEMA_ELEMENT_NAME + "/subjectAssessorData",v.getItem(),true);
			}
		} catch (Exception e1) {logger.error(e1);throw e1;}
	}

	/**
	 * subjectAssessorData
	 * set org.nrg.xdat.model.XnatSubjectassessordataI
	 */
	public <A extends org.nrg.xdat.model.XnatSubjectassessordataI> void setSubjectassessordata(A item) throws Exception{
	setSubjectassessordata((ItemI)item);
	}

	/**
	 * Removes the subjectAssessorData.
	 * */
	public void removeSubjectassessordata() {
		_Subjectassessordata =null;
		try{
			getItem().removeChild(SCHEMA_ELEMENT_NAME + "/subjectAssessorData",0);
		} catch (FieldNotFoundException e1) {logger.error(e1);}
		catch (java.lang.IndexOutOfBoundsException e1) {logger.error(e1);}
	}

	//FIELD

	private String _Species=null;

	/**
	 * @return Returns the species.
	 */
	public String getSpecies(){
		try{
			if (_Species==null){
				_Species=getStringProperty("species");
				return _Species;
			}else {
				return _Species;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for species.
	 * @param v Value to Set.
	 */
	public void setSpecies(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/species",v);
		_Species=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _Genotype=null;

	/**
	 * @return Returns the genotype.
	 */
	public String getGenotype(){
		try{
			if (_Genotype==null){
				_Genotype=getStringProperty("genotype");
				return _Genotype;
			}else {
				return _Genotype;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for genotype.
	 * @param v Value to Set.
	 */
	public void setGenotype(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/genotype",v);
		_Genotype=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _Tumourtype=null;

	/**
	 * @return Returns the tumourType.
	 */
	public String getTumourtype(){
		try{
			if (_Tumourtype==null){
				_Tumourtype=getStringProperty("tumourType");
				return _Tumourtype;
			}else {
				return _Tumourtype;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for tumourType.
	 * @param v Value to Set.
	 */
	public void setTumourtype(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/tumourType",v);
		_Tumourtype=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	public static ArrayList<org.nrg.xdat.om.IcrPreclinicaldemographicdata> getAllIcrPreclinicaldemographicdatas(org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.IcrPreclinicaldemographicdata> al = new ArrayList<org.nrg.xdat.om.IcrPreclinicaldemographicdata>();

		try{
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetAllItems(SCHEMA_ELEMENT_NAME,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ArrayList<org.nrg.xdat.om.IcrPreclinicaldemographicdata> getIcrPreclinicaldemographicdatasByField(String xmlPath, Object value, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.IcrPreclinicaldemographicdata> al = new ArrayList<org.nrg.xdat.om.IcrPreclinicaldemographicdata>();
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems(xmlPath,value,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ArrayList<org.nrg.xdat.om.IcrPreclinicaldemographicdata> getIcrPreclinicaldemographicdatasByField(org.nrg.xft.search.CriteriaCollection criteria, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.IcrPreclinicaldemographicdata> al = new ArrayList<org.nrg.xdat.om.IcrPreclinicaldemographicdata>();
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems(criteria,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static IcrPreclinicaldemographicdata getIcrPreclinicaldemographicdatasById(Object value, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems("icr:preclinicalDemographicData/id",value,user,preLoad);
			ItemI match = items.getFirst();
			if (match!=null)
				return (IcrPreclinicaldemographicdata) org.nrg.xdat.base.BaseElement.GetGeneratedItem(match);
			else
				 return null;
		} catch (Exception e) {
			logger.error("",e);
		}

		return null;
	}

	public static ArrayList wrapItems(ArrayList items)
	{
		ArrayList al = new ArrayList();
		al = org.nrg.xdat.base.BaseElement.WrapItems(items);
		al.trimToSize();
		return al;
	}

	public static ArrayList wrapItems(org.nrg.xft.collections.ItemCollection items)
	{
		return wrapItems(items.getItems());
	}

	public org.w3c.dom.Document toJoinedXML() throws Exception
	{
		ArrayList al = new ArrayList();
		al.add(this.getItem());
		al.add(org.nrg.xft.search.ItemSearch.GetItem("xnat:subjectData.ID",this.getItem().getProperty("xnat:mrSessionData.subject_ID"),getItem().getUser(),false));
		al.trimToSize();
		return org.nrg.xft.schema.Wrappers.XMLWrapper.XMLWriter.ItemListToDOM(al);
	}
	public ArrayList<ResourceFile> getFileResources(String rootPath, boolean preventLoop){
ArrayList<ResourceFile> _return = new ArrayList<ResourceFile>();
	 boolean localLoop = preventLoop;
	        localLoop = preventLoop;
	
	        //subjectAssessorData
	        XnatSubjectassessordata childSubjectassessordata = (XnatSubjectassessordata)this.getSubjectassessordata();
	            if (childSubjectassessordata!=null){
	              for(ResourceFile rf: ((XnatSubjectassessordata)childSubjectassessordata).getFileResources(rootPath, localLoop)) {
	                 rf.setXpath("subjectAssessorData[" + ((XnatSubjectassessordata)childSubjectassessordata).getItem().getPKString() + "]/" + rf.getXpath());
	                 rf.setXdatPath("subjectAssessorData/" + ((XnatSubjectassessordata)childSubjectassessordata).getItem().getPKString() + "/" + rf.getXpath());
	                 _return.add(rf);
	              }
	            }
	
	        localLoop = preventLoop;
	
	return _return;
}
}
