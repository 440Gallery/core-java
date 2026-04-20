class File extends Document{
	File(){
		super();
		pdf="portable document format";
		ppt="PowerPoint Presentation";
	}
	File(String pdf,String ppt){
		this.pdf=pdf;
		this.ppt=ppt;
	}
}
