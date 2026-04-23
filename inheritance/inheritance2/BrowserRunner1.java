class BrowserRunner1{
	public static void main(String[] args){
		Browser1 b1=new Browser1();
		Browser1 b2=new ChromeBrowser1();
		Browser1 b3=new FirefoxBrowser1();
		b1.Web();
		b2.Web();
		b3.Web();
		FirefoxBrowser1 b = new FirefoxBrowser1();
		b.SignIn();
	}
}