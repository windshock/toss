package o;

import com.facebook.react.bridge.ReadableMap;
import com.horcrux.svg.GroupView;
import com.horcrux.svg.SVGLength;
import com.horcrux.svg.TextView;
import java.util.ArrayList;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class ExoPlayerImplComponentListenerExternalSyntheticLambda3 {
    private int IAuthTabCallback;
    private final ArrayList<Integer> IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private final ArrayList<SVGLength[]> IAuthTabCallbackStubProxy;
    private SVGLength[] IAuthTabCallback_Parcel;
    private int ICustomTabsCallback;
    private final ArrayList<Integer> ICustomTabsCallbackDefault;
    private int ICustomTabsCallbackStub;
    private double ICustomTabsCallbackStubProxy;
    private int ICustomTabsCallback_Parcel;
    private final ArrayList<SVGLength[]> ICustomTabsService;
    private int access000;
    private final ArrayList<Integer> access100;
    private int asBinder;
    private final ArrayList<SVGLength[]> asInterface;
    private double extraCallback;
    private double[] extraCallbackWithResult;
    private final ArrayList<Integer> extraCommand;
    private final ArrayList<Integer> getInterfaceDescriptor;
    private int isEngagementSignalsApiAvailable;
    private double mayLaunchUrl;
    private int newAuthTabSession;
    private final ArrayList<SVGLength[]> newSession;
    private final ArrayList<Integer> newSessionWithExtras;
    private final ArrayList<double[]> onActivityLayout;
    private int onActivityResized;
    private double onExtraCallback;
    public final ArrayList<ExoPlayerImplComponentListenerExternalSyntheticLambda0> onExtraCallbackWithResult;
    private final float onMessageChannelReady;
    private final ArrayList<Integer> onMinimized;
    private SVGLength[] onNavigationEvent;
    private int onPostMessage;
    private SVGLength[] onRelationshipValidationResult;
    private double onTransact;
    private final float onUnminimized;
    private final ArrayList<Integer> onWarmupCompleted;
    private final ArrayList<Integer> postMessage;
    private SVGLength[] prefetch;
    private final ArrayList<Integer> readTypedObject;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda0 receiveFile;
    private final float writeTypedObject;

    private void onTransact() {
        this.extraCommand.add(Integer.valueOf(this.isEngagementSignalsApiAvailable));
        this.newSessionWithExtras.add(Integer.valueOf(this.newAuthTabSession));
        this.IAuthTabCallbackDefault.add(Integer.valueOf(this.IAuthTabCallbackStub));
        this.getInterfaceDescriptor.add(Integer.valueOf(this.access000));
        this.onMinimized.add(Integer.valueOf(this.onPostMessage));
    }

    public ExoPlayerImplComponentListenerExternalSyntheticLambda3(float f, float f2, float f3) {
        ArrayList<ExoPlayerImplComponentListenerExternalSyntheticLambda0> arrayList = new ArrayList<>();
        this.onExtraCallbackWithResult = arrayList;
        ArrayList<SVGLength[]> arrayList2 = new ArrayList<>();
        this.ICustomTabsService = arrayList2;
        ArrayList<SVGLength[]> arrayList3 = new ArrayList<>();
        this.newSession = arrayList3;
        ArrayList<SVGLength[]> arrayList4 = new ArrayList<>();
        this.asInterface = arrayList4;
        ArrayList<SVGLength[]> arrayList5 = new ArrayList<>();
        this.IAuthTabCallbackStubProxy = arrayList5;
        ArrayList<double[]> arrayList6 = new ArrayList<>();
        this.onActivityLayout = arrayList6;
        ArrayList<Integer> arrayList7 = new ArrayList<>();
        this.ICustomTabsCallbackDefault = arrayList7;
        ArrayList<Integer> arrayList8 = new ArrayList<>();
        this.postMessage = arrayList8;
        ArrayList<Integer> arrayList9 = new ArrayList<>();
        this.onWarmupCompleted = arrayList9;
        ArrayList<Integer> arrayList10 = new ArrayList<>();
        this.access100 = arrayList10;
        ArrayList<Integer> arrayList11 = new ArrayList<>();
        this.readTypedObject = arrayList11;
        this.extraCommand = new ArrayList<>();
        this.newSessionWithExtras = new ArrayList<>();
        this.IAuthTabCallbackDefault = new ArrayList<>();
        this.getInterfaceDescriptor = new ArrayList<>();
        this.onMinimized = new ArrayList<>();
        this.extraCallback = 12.0d;
        this.receiveFile = ExoPlayerImplComponentListenerExternalSyntheticLambda0.onExtraCallbackWithResult;
        SVGLength[] sVGLengthArr = new SVGLength[0];
        this.onRelationshipValidationResult = sVGLengthArr;
        this.prefetch = new SVGLength[0];
        this.onNavigationEvent = new SVGLength[0];
        this.IAuthTabCallback_Parcel = new SVGLength[0];
        this.extraCallbackWithResult = new double[]{0.0d};
        this.ICustomTabsCallbackStub = -1;
        this.ICustomTabsCallback_Parcel = -1;
        this.IAuthTabCallback = -1;
        this.asBinder = -1;
        this.ICustomTabsCallback = -1;
        this.onMessageChannelReady = f;
        this.onUnminimized = f2;
        this.writeTypedObject = f3;
        arrayList2.add(sVGLengthArr);
        arrayList3.add(this.prefetch);
        arrayList4.add(this.onNavigationEvent);
        arrayList5.add(this.IAuthTabCallback_Parcel);
        arrayList6.add(this.extraCallbackWithResult);
        arrayList7.add(Integer.valueOf(this.ICustomTabsCallbackStub));
        arrayList8.add(Integer.valueOf(this.ICustomTabsCallback_Parcel));
        arrayList9.add(Integer.valueOf(this.IAuthTabCallback));
        arrayList10.add(Integer.valueOf(this.asBinder));
        arrayList11.add(Integer.valueOf(this.ICustomTabsCallback));
        arrayList.add(this.receiveFile);
        onTransact();
    }

    private void access100() {
        this.onPostMessage = 0;
        this.access000 = 0;
        this.IAuthTabCallbackStub = 0;
        this.newAuthTabSession = 0;
        this.isEngagementSignalsApiAvailable = 0;
        this.ICustomTabsCallback = -1;
        this.asBinder = -1;
        this.IAuthTabCallback = -1;
        this.ICustomTabsCallback_Parcel = -1;
        this.ICustomTabsCallbackStub = -1;
        this.onTransact = 0.0d;
        this.onExtraCallback = 0.0d;
        this.mayLaunchUrl = 0.0d;
        this.ICustomTabsCallbackStubProxy = 0.0d;
    }

    public ExoPlayerImplComponentListenerExternalSyntheticLambda0 onExtraCallbackWithResult() {
        return this.receiveFile;
    }

    private ExoPlayerImplComponentListenerExternalSyntheticLambda0 onWarmupCompleted(GroupView groupView) {
        if (this.onActivityResized > 0) {
            return this.receiveFile;
        }
        for (GroupView parentTextRoot = groupView.getParentTextRoot(); parentTextRoot != null; parentTextRoot = parentTextRoot.getParentTextRoot()) {
            ExoPlayerImplComponentListenerExternalSyntheticLambda0 exoPlayerImplComponentListenerExternalSyntheticLambda0OnExtraCallbackWithResult = parentTextRoot.IAuthTabCallback().onExtraCallbackWithResult();
            if (exoPlayerImplComponentListenerExternalSyntheticLambda0OnExtraCallbackWithResult != ExoPlayerImplComponentListenerExternalSyntheticLambda0.onExtraCallbackWithResult) {
                return exoPlayerImplComponentListenerExternalSyntheticLambda0OnExtraCallbackWithResult;
            }
        }
        return ExoPlayerImplComponentListenerExternalSyntheticLambda0.onExtraCallbackWithResult;
    }

    private void onNavigationEvent(GroupView groupView, @Nullable ReadableMap readableMap) {
        ExoPlayerImplComponentListenerExternalSyntheticLambda0 exoPlayerImplComponentListenerExternalSyntheticLambda0OnWarmupCompleted = onWarmupCompleted(groupView);
        this.onActivityResized++;
        if (readableMap == null) {
            this.onExtraCallbackWithResult.add(exoPlayerImplComponentListenerExternalSyntheticLambda0OnWarmupCompleted);
            return;
        }
        ExoPlayerImplComponentListenerExternalSyntheticLambda0 exoPlayerImplComponentListenerExternalSyntheticLambda0 = new ExoPlayerImplComponentListenerExternalSyntheticLambda0(readableMap, exoPlayerImplComponentListenerExternalSyntheticLambda0OnWarmupCompleted, this.onMessageChannelReady);
        this.extraCallback = exoPlayerImplComponentListenerExternalSyntheticLambda0.asBinder;
        this.onExtraCallbackWithResult.add(exoPlayerImplComponentListenerExternalSyntheticLambda0);
        this.receiveFile = exoPlayerImplComponentListenerExternalSyntheticLambda0;
    }

    public void onWarmupCompleted(GroupView groupView, @Nullable ReadableMap readableMap) {
        onNavigationEvent(groupView, readableMap);
        onTransact();
    }

    private SVGLength[] onWarmupCompleted(ArrayList<SVGLength> arrayList) {
        int size = arrayList.size();
        SVGLength[] sVGLengthArr = new SVGLength[size];
        for (int i = 0; i < size; i++) {
            sVGLengthArr[i] = arrayList.get(i);
        }
        return sVGLengthArr;
    }

    private double[] onNavigationEvent(ArrayList<SVGLength> arrayList) {
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = arrayList.get(i).onWarmupCompleted;
        }
        return dArr;
    }

    public void IAuthTabCallback(boolean z, TextView textView, @Nullable ReadableMap readableMap, @Nullable ArrayList<SVGLength> arrayList, @Nullable ArrayList<SVGLength> arrayList2, @Nullable ArrayList<SVGLength> arrayList3, @Nullable ArrayList<SVGLength> arrayList4, @Nullable ArrayList<SVGLength> arrayList5) {
        if (z) {
            access100();
        }
        onNavigationEvent((GroupView) textView, readableMap);
        if (arrayList != null && arrayList.size() != 0) {
            this.isEngagementSignalsApiAvailable++;
            this.ICustomTabsCallbackStub = -1;
            this.ICustomTabsCallbackDefault.add(-1);
            SVGLength[] sVGLengthArrOnWarmupCompleted = onWarmupCompleted(arrayList);
            this.onRelationshipValidationResult = sVGLengthArrOnWarmupCompleted;
            this.ICustomTabsService.add(sVGLengthArrOnWarmupCompleted);
        }
        if (arrayList2 != null && arrayList2.size() != 0) {
            this.newAuthTabSession++;
            this.ICustomTabsCallback_Parcel = -1;
            this.postMessage.add(-1);
            SVGLength[] sVGLengthArrOnWarmupCompleted2 = onWarmupCompleted(arrayList2);
            this.prefetch = sVGLengthArrOnWarmupCompleted2;
            this.newSession.add(sVGLengthArrOnWarmupCompleted2);
        }
        if (arrayList3 != null && arrayList3.size() != 0) {
            this.IAuthTabCallbackStub++;
            this.IAuthTabCallback = -1;
            this.onWarmupCompleted.add(-1);
            SVGLength[] sVGLengthArrOnWarmupCompleted3 = onWarmupCompleted(arrayList3);
            this.onNavigationEvent = sVGLengthArrOnWarmupCompleted3;
            this.asInterface.add(sVGLengthArrOnWarmupCompleted3);
        }
        if (arrayList4 != null && arrayList4.size() != 0) {
            this.access000++;
            this.asBinder = -1;
            this.access100.add(-1);
            SVGLength[] sVGLengthArrOnWarmupCompleted4 = onWarmupCompleted(arrayList4);
            this.IAuthTabCallback_Parcel = sVGLengthArrOnWarmupCompleted4;
            this.IAuthTabCallbackStubProxy.add(sVGLengthArrOnWarmupCompleted4);
        }
        if (arrayList5 != null && arrayList5.size() != 0) {
            this.onPostMessage++;
            this.ICustomTabsCallback = -1;
            this.readTypedObject.add(-1);
            double[] dArrOnNavigationEvent = onNavigationEvent(arrayList5);
            this.extraCallbackWithResult = dArrOnNavigationEvent;
            this.onActivityLayout.add(dArrOnNavigationEvent);
        }
        onTransact();
    }

    public void IAuthTabCallbackDefault() {
        this.onExtraCallbackWithResult.remove(this.onActivityResized);
        this.extraCommand.remove(this.onActivityResized);
        this.newSessionWithExtras.remove(this.onActivityResized);
        this.IAuthTabCallbackDefault.remove(this.onActivityResized);
        this.getInterfaceDescriptor.remove(this.onActivityResized);
        this.onMinimized.remove(this.onActivityResized);
        int i = this.onActivityResized - 1;
        this.onActivityResized = i;
        int i2 = this.isEngagementSignalsApiAvailable;
        int i3 = this.newAuthTabSession;
        int i4 = this.IAuthTabCallbackStub;
        int i5 = this.access000;
        int i6 = this.onPostMessage;
        this.receiveFile = this.onExtraCallbackWithResult.get(i);
        this.isEngagementSignalsApiAvailable = this.extraCommand.get(this.onActivityResized).intValue();
        this.newAuthTabSession = this.newSessionWithExtras.get(this.onActivityResized).intValue();
        this.IAuthTabCallbackStub = this.IAuthTabCallbackDefault.get(this.onActivityResized).intValue();
        this.access000 = this.getInterfaceDescriptor.get(this.onActivityResized).intValue();
        this.onPostMessage = this.onMinimized.get(this.onActivityResized).intValue();
        if (i2 != this.isEngagementSignalsApiAvailable) {
            this.ICustomTabsService.remove(i2);
            this.onRelationshipValidationResult = this.ICustomTabsService.get(this.isEngagementSignalsApiAvailable);
            this.ICustomTabsCallbackStub = this.ICustomTabsCallbackDefault.get(this.isEngagementSignalsApiAvailable).intValue();
        }
        if (i3 != this.newAuthTabSession) {
            this.newSession.remove(i3);
            this.prefetch = this.newSession.get(this.newAuthTabSession);
            this.ICustomTabsCallback_Parcel = this.postMessage.get(this.newAuthTabSession).intValue();
        }
        if (i4 != this.IAuthTabCallbackStub) {
            this.asInterface.remove(i4);
            this.onNavigationEvent = this.asInterface.get(this.IAuthTabCallbackStub);
            this.IAuthTabCallback = this.onWarmupCompleted.get(this.IAuthTabCallbackStub).intValue();
        }
        if (i5 != this.access000) {
            this.IAuthTabCallbackStubProxy.remove(i5);
            this.IAuthTabCallback_Parcel = this.IAuthTabCallbackStubProxy.get(this.access000);
            this.asBinder = this.access100.get(this.access000).intValue();
        }
        if (i6 != this.onPostMessage) {
            this.onActivityLayout.remove(i6);
            this.extraCallbackWithResult = this.onActivityLayout.get(this.onPostMessage);
            this.ICustomTabsCallback = this.readTypedObject.get(this.onPostMessage).intValue();
        }
    }

    private static void onNavigationEvent(ArrayList<Integer> arrayList, int i) {
        while (i >= 0) {
            arrayList.set(i, Integer.valueOf(arrayList.get(i).intValue() + 1));
            i--;
        }
    }

    public double IAuthTabCallback() {
        return this.extraCallback;
    }

    public double onExtraCallbackWithResult(double d) {
        onNavigationEvent(this.ICustomTabsCallbackDefault, this.isEngagementSignalsApiAvailable);
        int i = this.ICustomTabsCallbackStub + 1;
        SVGLength[] sVGLengthArr = this.onRelationshipValidationResult;
        if (i < sVGLengthArr.length) {
            this.onExtraCallback = 0.0d;
            this.ICustomTabsCallbackStub = i;
            this.ICustomTabsCallbackStubProxy = ExoPlayerImplComponentListenerExternalSyntheticLambda5.IAuthTabCallback(sVGLengthArr[i], this.onUnminimized, 0.0d, this.onMessageChannelReady, this.extraCallback);
        }
        double d2 = this.ICustomTabsCallbackStubProxy + d;
        this.ICustomTabsCallbackStubProxy = d2;
        return d2;
    }

    public double asInterface() {
        onNavigationEvent(this.postMessage, this.newAuthTabSession);
        int i = this.ICustomTabsCallback_Parcel + 1;
        SVGLength[] sVGLengthArr = this.prefetch;
        if (i < sVGLengthArr.length) {
            this.onTransact = 0.0d;
            this.ICustomTabsCallback_Parcel = i;
            this.mayLaunchUrl = ExoPlayerImplComponentListenerExternalSyntheticLambda5.IAuthTabCallback(sVGLengthArr[i], this.writeTypedObject, 0.0d, this.onMessageChannelReady, this.extraCallback);
        }
        return this.mayLaunchUrl;
    }

    public double onWarmupCompleted() {
        onNavigationEvent(this.onWarmupCompleted, this.IAuthTabCallbackStub);
        int i = this.IAuthTabCallback + 1;
        SVGLength[] sVGLengthArr = this.onNavigationEvent;
        if (i < sVGLengthArr.length) {
            this.IAuthTabCallback = i;
            this.onExtraCallback += ExoPlayerImplComponentListenerExternalSyntheticLambda5.IAuthTabCallback(sVGLengthArr[i], this.onUnminimized, 0.0d, this.onMessageChannelReady, this.extraCallback);
        }
        return this.onExtraCallback;
    }

    public double IAuthTabCallbackStub() {
        onNavigationEvent(this.access100, this.access000);
        int i = this.asBinder + 1;
        SVGLength[] sVGLengthArr = this.IAuthTabCallback_Parcel;
        if (i < sVGLengthArr.length) {
            this.asBinder = i;
            this.onTransact += ExoPlayerImplComponentListenerExternalSyntheticLambda5.IAuthTabCallback(sVGLengthArr[i], this.writeTypedObject, 0.0d, this.onMessageChannelReady, this.extraCallback);
        }
        return this.onTransact;
    }

    public double asBinder() {
        onNavigationEvent(this.readTypedObject, this.onPostMessage);
        int iMin = Math.min(this.ICustomTabsCallback + 1, this.extraCallbackWithResult.length - 1);
        this.ICustomTabsCallback = iMin;
        return this.extraCallbackWithResult[iMin];
    }

    public float onExtraCallback() {
        return this.onUnminimized;
    }

    public float onNavigationEvent() {
        return this.writeTypedObject;
    }
}
