/*
 * GENERATED FILE
 * Created on Wed Aug 09 11:56:09 BST 2017
 *
 */

/**
 * @author XDAT
 *
 */

function icr_preclinicalDemographicData(){
this.xsiType="icr:preclinicalDemographicData";

	this.getSchemaElementName=function(){
		return "preclinicalDemographicData";
	}

	this.getFullSchemaElementName=function(){
		return "icr:preclinicalDemographicData";
	}
this.extension=dynamicJSLoad('xnat_subjectAssessorData','generated/xnat_subjectAssessorData.js');

	this.Species=null;


	function getSpecies() {
		return this.Species;
	}
	this.getSpecies=getSpecies;


	function setSpecies(v){
		this.Species=v;
	}
	this.setSpecies=setSpecies;

	this.Genotype=null;


	function getGenotype() {
		return this.Genotype;
	}
	this.getGenotype=getGenotype;


	function setGenotype(v){
		this.Genotype=v;
	}
	this.setGenotype=setGenotype;

	this.Tumourtype=null;


	function getTumourtype() {
		return this.Tumourtype;
	}
	this.getTumourtype=getTumourtype;


	function setTumourtype(v){
		this.Tumourtype=v;
	}
	this.setTumourtype=setTumourtype;


	this.getProperty=function(xmlPath){
			if(xmlPath.startsWith(this.getFullSchemaElementName())){
				xmlPath=xmlPath.substring(this.getFullSchemaElementName().length + 1);
			}
			if(xmlPath=="subjectAssessorData"){
				return this.Subjectassessordata ;
			} else 
			if(xmlPath.startsWith("subjectAssessorData")){
				xmlPath=xmlPath.substring(19);
				if(xmlPath=="")return this.Subjectassessordata ;
				if(xmlPath.startsWith("[")){
					if (xmlPath.indexOf("/")>-1){
						var optionString=xmlPath.substring(0,xmlPath.indexOf("/"));
						xmlPath=xmlPath.substring(xmlPath.indexOf("/")+1);
					}else{
						var optionString=xmlPath;
						xmlPath="";
					}
					
					var options = loadOptions(optionString);//omUtils.js
				}else{xmlPath=xmlPath.substring(1);}
				if(this.Subjectassessordata!=undefined)return this.Subjectassessordata.getProperty(xmlPath);
				else return null;
			} else 
			if(xmlPath=="species"){
				return this.Species ;
			} else 
			if(xmlPath=="genotype"){
				return this.Genotype ;
			} else 
			if(xmlPath=="tumourType"){
				return this.Tumourtype ;
			} else 
			if(xmlPath=="meta"){
				return this.Meta ;
			} else 
			{
				return this.extension.getProperty(xmlPath);
			}
	}


	this.setProperty=function(xmlPath,value){
			if(xmlPath.startsWith(this.getFullSchemaElementName())){
				xmlPath=xmlPath.substring(this.getFullSchemaElementName().length + 1);
			}
			if(xmlPath=="subjectAssessorData"){
				this.Subjectassessordata=value;
			} else 
			if(xmlPath.startsWith("subjectAssessorData")){
				xmlPath=xmlPath.substring(19);
				if(xmlPath=="")return this.Subjectassessordata ;
				if(xmlPath.startsWith("[")){
					if (xmlPath.indexOf("/")>-1){
						var optionString=xmlPath.substring(0,xmlPath.indexOf("/"));
						xmlPath=xmlPath.substring(xmlPath.indexOf("/")+1);
					}else{
						var optionString=xmlPath;
						xmlPath="";
					}
					
					var options = loadOptions(optionString);//omUtils.js
				}else{xmlPath=xmlPath.substring(1);}
				if(this.Subjectassessordata!=undefined){
					this.Subjectassessordata.setProperty(xmlPath,value);
				}else{
						if(options && options.xsiType){
							this.Subjectassessordata= instanciateObject(options.xsiType);//omUtils.js
						}else{
							this.Subjectassessordata= instanciateObject("xnat:subjectAssessorData");//omUtils.js
						}
						if(options && options.where)this.Subjectassessordata.setProperty(options.where.field,options.where.value);
						this.Subjectassessordata.setProperty(xmlPath,value);
				}
			} else 
			if(xmlPath=="species"){
				this.Species=value;
			} else 
			if(xmlPath=="genotype"){
				this.Genotype=value;
			} else 
			if(xmlPath=="tumourType"){
				this.Tumourtype=value;
			} else 
			if(xmlPath=="meta"){
				this.Meta=value;
			} else 
			{
				return this.extension.setProperty(xmlPath,value);
			}
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	this.setReferenceField=function(xmlPath,v) {
			this.extension.setReferenceField(xmlPath,v);
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	this.getReferenceFieldName=function(xmlPath) {
			return this.extension.getReferenceFieldName(xmlPath);
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	this.getFieldType=function(xmlPath){
		if (xmlPath=="species"){
			return "field_data";
		}else if (xmlPath=="genotype"){
			return "field_data";
		}else if (xmlPath=="tumourType"){
			return "field_data";
		}
		else{
			return this.extension.getFieldType(xmlPath);
		}
	}


	this.toXML=function(xmlTxt,preventComments){
		xmlTxt+="<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
		xmlTxt+="\n<icr:PreclinicalDemographicData";
		xmlTxt+=this.getXMLAtts();
		xmlTxt+=" xmlns:arc=\"http://nrg.wustl.edu/arc\"";
		xmlTxt+=" xmlns:cat=\"http://nrg.wustl.edu/catalog\"";
		xmlTxt+=" xmlns:icr=\"http://nrg.wustl.edu/icr\"";
		xmlTxt+=" xmlns:pipe=\"http://nrg.wustl.edu/pipe\"";
		xmlTxt+=" xmlns:prov=\"http://www.nbirn.net/prov\"";
		xmlTxt+=" xmlns:scr=\"http://nrg.wustl.edu/scr\"";
		xmlTxt+=" xmlns:val=\"http://nrg.wustl.edu/val\"";
		xmlTxt+=" xmlns:wrk=\"http://nrg.wustl.edu/workflow\"";
		xmlTxt+=" xmlns:xdat=\"http://nrg.wustl.edu/security\"";
		xmlTxt+=" xmlns:xnat=\"http://nrg.wustl.edu/xnat\"";
		xmlTxt+=" xmlns:xnat_a=\"http://nrg.wustl.edu/xnat_assessments\"";
		xmlTxt+=" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"";
		xmlTxt+=">";
		xmlTxt+=this.getXMLBody(preventComments)
		xmlTxt+="\n</icr:PreclinicalDemographicData>";
		return xmlTxt;
	}


	this.getXMLComments=function(preventComments){
		var str ="";
		if((preventComments==undefined || !preventComments) && this.hasXMLComments()){
		}
		return str;
	}


	this.getXMLAtts=function(){
		var attTxt = this.extension.getXMLAtts();
		return attTxt;
	}


	this.getXMLBody=function(preventComments){
		var xmlTxt=this.getXMLComments(preventComments);
		xmlTxt+=this.extension.getXMLBody(preventComments);
		if (this.Species!=null){
			xmlTxt+="\n<icr:species";
			xmlTxt+=">";
			xmlTxt+=this.Species.replace(/>/g,"&gt;").replace(/</g,"&lt;");
			xmlTxt+="</icr:species>";
		}
		if (this.Genotype!=null){
			xmlTxt+="\n<icr:genotype";
			xmlTxt+=">";
			xmlTxt+=this.Genotype.replace(/>/g,"&gt;").replace(/</g,"&lt;");
			xmlTxt+="</icr:genotype>";
		}
		if (this.Tumourtype!=null){
			xmlTxt+="\n<icr:tumourType";
			xmlTxt+=">";
			xmlTxt+=this.Tumourtype.replace(/>/g,"&gt;").replace(/</g,"&lt;");
			xmlTxt+="</icr:tumourType>";
		}
		return xmlTxt;
	}


	this.hasXMLComments=function(){
	}


	this.hasXMLBodyContent=function(){
		if (this.Species!=null) return true;
		if (this.Genotype!=null) return true;
		if (this.Tumourtype!=null) return true;
		if(this.hasXMLComments())return true;
		if(this.extension.hasXMLBodyContent())return true;
		return false;
	}
}
