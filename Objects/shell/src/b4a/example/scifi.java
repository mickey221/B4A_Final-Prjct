
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class scifi implements IRemote{
	public static scifi mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public scifi() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("scifi"), "b4a.example.scifi");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, scifi.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _scrollview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _drama1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _drama2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _drama3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _drama4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _drama5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _drama6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _drama7 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _drama8 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _drama9 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _drama10 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _dramaimage1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _dramaimage2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _dramaimage3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _dramaimage4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _dramaimage5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _dramaimage6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _dramaimage7 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _dramaimage8 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _dramaimage9 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _dramaimage10 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _searchbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _searchengine = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panel1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelmovie1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelmovie2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelmovie3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelmovie4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelmovie5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelmovie6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelmovie7 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelmovie8 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelmovie9 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelmovie10 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _dramapage = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _homepage = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _scifipage = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _actionpage = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _starter1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _starter2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _starter3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _starter4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _starter5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _starter6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _starter7 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _starter8 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _starter9 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _starter10 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _overview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _overview2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _overview3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _overview4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _overview5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _overview6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _overview7 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _overview8 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _overview9 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _overview10 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _year1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _year2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _year3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _year4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _year5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _year6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _year7 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _year8 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _year9 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _year10 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.drama _drama = null;
public static b4a.example.action _action = null;
public static b4a.example.panelview _panelview = null;
  public Object[] GetGlobals() {
		return new Object[] {"Action",Debug.moduleToString(b4a.example.action.class),"ActionPage",scifi.mostCurrent._actionpage,"Activity",scifi.mostCurrent._activity,"Drama",Debug.moduleToString(b4a.example.drama.class),"Drama1",scifi.mostCurrent._drama1,"Drama10",scifi.mostCurrent._drama10,"Drama2",scifi.mostCurrent._drama2,"Drama3",scifi.mostCurrent._drama3,"Drama4",scifi.mostCurrent._drama4,"Drama5",scifi.mostCurrent._drama5,"Drama6",scifi.mostCurrent._drama6,"Drama7",scifi.mostCurrent._drama7,"Drama8",scifi.mostCurrent._drama8,"Drama9",scifi.mostCurrent._drama9,"DramaImage1",scifi.mostCurrent._dramaimage1,"DramaImage10",scifi.mostCurrent._dramaimage10,"DramaImage2",scifi.mostCurrent._dramaimage2,"DramaImage3",scifi.mostCurrent._dramaimage3,"DramaImage4",scifi.mostCurrent._dramaimage4,"DramaImage5",scifi.mostCurrent._dramaimage5,"DramaImage6",scifi.mostCurrent._dramaimage6,"DramaImage7",scifi.mostCurrent._dramaimage7,"DramaImage8",scifi.mostCurrent._dramaimage8,"DramaImage9",scifi.mostCurrent._dramaimage9,"DramaPage",scifi.mostCurrent._dramapage,"HomePage",scifi.mostCurrent._homepage,"Main",Debug.moduleToString(b4a.example.main.class),"OverView1",scifi.mostCurrent._overview1,"OverView10",scifi.mostCurrent._overview10,"OverView2",scifi.mostCurrent._overview2,"OverView3",scifi.mostCurrent._overview3,"OverView4",scifi.mostCurrent._overview4,"OverView5",scifi.mostCurrent._overview5,"OverView6",scifi.mostCurrent._overview6,"OverView7",scifi.mostCurrent._overview7,"OverView8",scifi.mostCurrent._overview8,"OverView9",scifi.mostCurrent._overview9,"p",scifi.mostCurrent._p,"Panel1",scifi.mostCurrent._panel1,"PanelMovie1",scifi.mostCurrent._panelmovie1,"PanelMovie10",scifi.mostCurrent._panelmovie10,"PanelMovie2",scifi.mostCurrent._panelmovie2,"PanelMovie3",scifi.mostCurrent._panelmovie3,"PanelMovie4",scifi.mostCurrent._panelmovie4,"PanelMovie5",scifi.mostCurrent._panelmovie5,"PanelMovie6",scifi.mostCurrent._panelmovie6,"PanelMovie7",scifi.mostCurrent._panelmovie7,"PanelMovie8",scifi.mostCurrent._panelmovie8,"PanelMovie9",scifi.mostCurrent._panelmovie9,"panelView",Debug.moduleToString(b4a.example.panelview.class),"SciFiPage",scifi.mostCurrent._scifipage,"ScrollView1",scifi.mostCurrent._scrollview1,"SearchBtn",scifi.mostCurrent._searchbtn,"SearchEngine",scifi.mostCurrent._searchengine,"Starter",Debug.moduleToString(b4a.example.starter.class),"Starter1",scifi.mostCurrent._starter1,"Starter10",scifi.mostCurrent._starter10,"Starter2",scifi.mostCurrent._starter2,"Starter3",scifi.mostCurrent._starter3,"Starter4",scifi.mostCurrent._starter4,"Starter5",scifi.mostCurrent._starter5,"Starter6",scifi.mostCurrent._starter6,"Starter7",scifi.mostCurrent._starter7,"Starter8",scifi.mostCurrent._starter8,"Starter9",scifi.mostCurrent._starter9,"Year1",scifi.mostCurrent._year1,"Year10",scifi.mostCurrent._year10,"Year2",scifi.mostCurrent._year2,"Year3",scifi.mostCurrent._year3,"Year4",scifi.mostCurrent._year4,"Year5",scifi.mostCurrent._year5,"Year6",scifi.mostCurrent._year6,"Year7",scifi.mostCurrent._year7,"Year8",scifi.mostCurrent._year8,"Year9",scifi.mostCurrent._year9};
}
}