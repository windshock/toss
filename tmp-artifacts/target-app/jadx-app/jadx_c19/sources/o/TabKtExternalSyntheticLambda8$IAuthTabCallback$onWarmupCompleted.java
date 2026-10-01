package o;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.annotation.Nullable;
import androidx.media3.session.legacy.RatingCompat;
import java.util.List;
import o.TabKtExternalSyntheticLambda8;
import o.TabRowKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class TabKtExternalSyntheticLambda8$IAuthTabCallback$onWarmupCompleted implements TabKtExternalSyntheticLambda8 {
    public static TabKtExternalSyntheticLambda8 onNavigationEvent;
    private IBinder onWarmupCompleted;

    TabKtExternalSyntheticLambda8$IAuthTabCallback$onWarmupCompleted(IBinder iBinder) {
        this.onWarmupCompleted = iBinder;
    }

    public IBinder asBinder() {
        return this.onWarmupCompleted;
    }

    public void onWarmupCompleted(@Nullable String str, @Nullable Bundle bundle, @Nullable TabRowKtExternalSyntheticLambda0.asInterface asinterface) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeString(str);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (asinterface != null) {
                parcelObtain.writeInt(1);
                asinterface.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.onWarmupCompleted.transact(1, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).onWarmupCompleted(str, bundle, asinterface);
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public boolean onExtraCallback(@Nullable KeyEvent keyEvent) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (keyEvent != null) {
                parcelObtain.writeInt(1);
                keyEvent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.onWarmupCompleted.transact(2, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                return ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).onExtraCallback(keyEvent);
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void IAuthTabCallback(@Nullable TabKtExternalSyntheticLambda4 tabKtExternalSyntheticLambda4) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeStrongBinder(tabKtExternalSyntheticLambda4 != null ? tabKtExternalSyntheticLambda4.asBinder() : null);
            if (!this.onWarmupCompleted.transact(3, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).IAuthTabCallback(tabKtExternalSyntheticLambda4);
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void onNavigationEvent(@Nullable TabKtExternalSyntheticLambda4 tabKtExternalSyntheticLambda4) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeStrongBinder(tabKtExternalSyntheticLambda4 != null ? tabKtExternalSyntheticLambda4.asBinder() : null);
            if (!this.onWarmupCompleted.transact(4, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).onNavigationEvent(tabKtExternalSyntheticLambda4);
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public boolean extraCallbackWithResult() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.onWarmupCompleted.transact(5, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                return ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).extraCallbackWithResult();
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public String onTransact() throws RemoteException {
        String string;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.onWarmupCompleted.transact(6, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                string = ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).onTransact();
            } else {
                parcelObtain2.readException();
                string = parcelObtain2.readString();
            }
            return string;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public String IAuthTabCallback_Parcel() throws RemoteException {
        String string;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.onWarmupCompleted.transact(7, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                string = ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).IAuthTabCallback_Parcel();
            } else {
                parcelObtain2.readException();
                string = parcelObtain2.readString();
            }
            return string;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public PendingIntent onWarmupCompleted() throws RemoteException {
        PendingIntent pendingIntentOnWarmupCompleted;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.onWarmupCompleted.transact(8, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                pendingIntentOnWarmupCompleted = ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).onWarmupCompleted();
            } else {
                parcelObtain2.readException();
                pendingIntentOnWarmupCompleted = parcelObtain2.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcelObtain2) : null;
            }
            return pendingIntentOnWarmupCompleted;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public long onNavigationEvent() throws RemoteException {
        long jOnNavigationEvent;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.onWarmupCompleted.transact(9, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                jOnNavigationEvent = ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).onNavigationEvent();
            } else {
                parcelObtain2.readException();
                jOnNavigationEvent = parcelObtain2.readLong();
            }
            return jOnNavigationEvent;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public TabRowKtExternalSyntheticLambda5 writeTypedObject() throws RemoteException {
        TabRowKtExternalSyntheticLambda5 tabRowKtExternalSyntheticLambda5WriteTypedObject;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.onWarmupCompleted.transact(10, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                tabRowKtExternalSyntheticLambda5WriteTypedObject = ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).writeTypedObject();
            } else {
                parcelObtain2.readException();
                tabRowKtExternalSyntheticLambda5WriteTypedObject = parcelObtain2.readInt() != 0 ? (TabRowKtExternalSyntheticLambda5) TabRowKtExternalSyntheticLambda5.CREATOR.createFromParcel(parcelObtain2) : null;
            }
            return tabRowKtExternalSyntheticLambda5WriteTypedObject;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void onNavigationEvent(int i2, int i3, @Nullable String str) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            parcelObtain.writeString(str);
            if (!this.onWarmupCompleted.transact(11, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).onNavigationEvent(i2, i3, str);
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void onWarmupCompleted(int i2, int i3, @Nullable String str) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            parcelObtain.writeString(str);
            if (!this.onWarmupCompleted.transact(12, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).onWarmupCompleted(i2, i3, str);
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public TabRowKtExternalSyntheticLambda1 onExtraCallbackWithResult() throws RemoteException {
        TabRowKtExternalSyntheticLambda1 tabRowKtExternalSyntheticLambda1OnExtraCallbackWithResult;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.onWarmupCompleted.transact(27, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                tabRowKtExternalSyntheticLambda1OnExtraCallbackWithResult = ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).onExtraCallbackWithResult();
            } else {
                parcelObtain2.readException();
                tabRowKtExternalSyntheticLambda1OnExtraCallbackWithResult = parcelObtain2.readInt() != 0 ? (TabRowKtExternalSyntheticLambda1) TabRowKtExternalSyntheticLambda1.CREATOR.createFromParcel(parcelObtain2) : null;
            }
            return tabRowKtExternalSyntheticLambda1OnExtraCallbackWithResult;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public TabRowKtExternalSyntheticLambda6 IAuthTabCallbackDefault() throws RemoteException {
        TabRowKtExternalSyntheticLambda6 tabRowKtExternalSyntheticLambda6IAuthTabCallbackDefault;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.onWarmupCompleted.transact(28, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                tabRowKtExternalSyntheticLambda6IAuthTabCallbackDefault = ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).IAuthTabCallbackDefault();
            } else {
                parcelObtain2.readException();
                tabRowKtExternalSyntheticLambda6IAuthTabCallbackDefault = parcelObtain2.readInt() != 0 ? (TabRowKtExternalSyntheticLambda6) TabRowKtExternalSyntheticLambda6.CREATOR.createFromParcel(parcelObtain2) : null;
            }
            return tabRowKtExternalSyntheticLambda6IAuthTabCallbackDefault;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public List<TabRowKtExternalSyntheticLambda0.IAuthTabCallbackStub> IAuthTabCallbackStub() throws RemoteException {
        List<TabRowKtExternalSyntheticLambda0.IAuthTabCallbackStub> listCreateTypedArrayList;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.onWarmupCompleted.transact(29, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                listCreateTypedArrayList = ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).IAuthTabCallbackStub();
            } else {
                parcelObtain2.readException();
                listCreateTypedArrayList = parcelObtain2.createTypedArrayList(TabRowKtExternalSyntheticLambda0.IAuthTabCallbackStub.CREATOR);
            }
            return listCreateTypedArrayList;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public CharSequence asInterface() throws RemoteException {
        CharSequence charSequenceAsInterface;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.onWarmupCompleted.transact(30, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                charSequenceAsInterface = ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).asInterface();
            } else {
                parcelObtain2.readException();
                charSequenceAsInterface = parcelObtain2.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcelObtain2) : null;
            }
            return charSequenceAsInterface;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public Bundle IAuthTabCallback() throws RemoteException {
        Bundle bundleIAuthTabCallback;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.onWarmupCompleted.transact(31, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                bundleIAuthTabCallback = ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).IAuthTabCallback();
            } else {
                parcelObtain2.readException();
                bundleIAuthTabCallback = parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
            }
            return bundleIAuthTabCallback;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public int access100() throws RemoteException {
        int iAccess100;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.onWarmupCompleted.transact(32, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                iAccess100 = ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).access100();
            } else {
                parcelObtain2.readException();
                iAccess100 = parcelObtain2.readInt();
            }
            return iAccess100;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public boolean extraCallback() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.onWarmupCompleted.transact(45, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                return ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).extraCallback();
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public int ae_() throws RemoteException {
        int iAe_;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.onWarmupCompleted.transact(37, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                iAe_ = ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).ae_();
            } else {
                parcelObtain2.readException();
                iAe_ = parcelObtain2.readInt();
            }
            return iAe_;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public boolean readTypedObject() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.onWarmupCompleted.transact(38, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                return ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).readTypedObject();
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public int access000() throws RemoteException {
        int iAccess000;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.onWarmupCompleted.transact(47, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                iAccess000 = ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).access000();
            } else {
                parcelObtain2.readException();
                iAccess000 = parcelObtain2.readInt();
            }
            return iAccess000;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void onExtraCallback(@Nullable TabRowDefaultsExternalSyntheticLambda3 tabRowDefaultsExternalSyntheticLambda3) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (tabRowDefaultsExternalSyntheticLambda3 != null) {
                parcelObtain.writeInt(1);
                tabRowDefaultsExternalSyntheticLambda3.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.onWarmupCompleted.transact(41, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).onExtraCallback(tabRowDefaultsExternalSyntheticLambda3);
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void onWarmupCompleted(@Nullable TabRowDefaultsExternalSyntheticLambda3 tabRowDefaultsExternalSyntheticLambda3, int i2) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (tabRowDefaultsExternalSyntheticLambda3 != null) {
                parcelObtain.writeInt(1);
                tabRowDefaultsExternalSyntheticLambda3.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeInt(i2);
            if (!this.onWarmupCompleted.transact(42, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).onWarmupCompleted(tabRowDefaultsExternalSyntheticLambda3, i2);
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void IAuthTabCallback(@Nullable TabRowDefaultsExternalSyntheticLambda3 tabRowDefaultsExternalSyntheticLambda3) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (tabRowDefaultsExternalSyntheticLambda3 != null) {
                parcelObtain.writeInt(1);
                tabRowDefaultsExternalSyntheticLambda3.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.onWarmupCompleted.transact(43, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).IAuthTabCallback(tabRowDefaultsExternalSyntheticLambda3);
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void onExtraCallback(int i2) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeInt(i2);
            if (!this.onWarmupCompleted.transact(44, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).onExtraCallback(i2);
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public Bundle IAuthTabCallbackStubProxy() throws RemoteException {
        Bundle bundleIAuthTabCallbackStubProxy;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.onWarmupCompleted.transact(50, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                bundleIAuthTabCallbackStubProxy = ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).IAuthTabCallbackStubProxy();
            } else {
                parcelObtain2.readException();
                bundleIAuthTabCallbackStubProxy = parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
            }
            return bundleIAuthTabCallbackStubProxy;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void onActivityResized() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.onWarmupCompleted.transact(33, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).onActivityResized();
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void onWarmupCompleted(@Nullable String str, @Nullable Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeString(str);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.onWarmupCompleted.transact(34, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).onWarmupCompleted(str, bundle);
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void onExtraCallback(@Nullable String str, @Nullable Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeString(str);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.onWarmupCompleted.transact(35, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).onExtraCallback(str, bundle);
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void IAuthTabCallback(@Nullable Uri uri, @Nullable Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (uri != null) {
                parcelObtain.writeInt(1);
                uri.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.onWarmupCompleted.transact(36, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).IAuthTabCallback(uri, bundle);
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void onPostMessage() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.onWarmupCompleted.transact(13, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).onPostMessage();
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void IAuthTabCallback(@Nullable String str, @Nullable Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeString(str);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.onWarmupCompleted.transact(14, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).IAuthTabCallback(str, bundle);
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void onNavigationEvent(@Nullable String str, @Nullable Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeString(str);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.onWarmupCompleted.transact(15, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).onNavigationEvent(str, bundle);
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void onExtraCallback(@Nullable Uri uri, @Nullable Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (uri != null) {
                parcelObtain.writeInt(1);
                uri.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.onWarmupCompleted.transact(16, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).onExtraCallback(uri, bundle);
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void onWarmupCompleted(long j) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeLong(j);
            if (!this.onWarmupCompleted.transact(17, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).onWarmupCompleted(j);
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void onActivityLayout() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.onWarmupCompleted.transact(18, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).onActivityLayout();
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void onRelationshipValidationResult() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.onWarmupCompleted.transact(19, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).onRelationshipValidationResult();
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void ICustomTabsCallback() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.onWarmupCompleted.transact(20, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).ICustomTabsCallback();
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void onMinimized() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.onWarmupCompleted.transact(21, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).onMinimized();
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void onExtraCallback() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.onWarmupCompleted.transact(22, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).onExtraCallback();
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void onMessageChannelReady() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.onWarmupCompleted.transact(23, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).onMessageChannelReady();
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void onExtraCallback(long j) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeLong(j);
            if (!this.onWarmupCompleted.transact(24, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).onExtraCallback(j);
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void onExtraCallbackWithResult(@Nullable RatingCompat ratingCompat) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (ratingCompat != null) {
                parcelObtain.writeInt(1);
                ratingCompat.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.onWarmupCompleted.transact(25, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).onExtraCallbackWithResult(ratingCompat);
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void onWarmupCompleted(@Nullable RatingCompat ratingCompat, @Nullable Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (ratingCompat != null) {
                parcelObtain.writeInt(1);
                ratingCompat.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.onWarmupCompleted.transact(51, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).onWarmupCompleted(ratingCompat, bundle);
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void onNavigationEvent(float f) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeFloat(f);
            if (!this.onWarmupCompleted.transact(49, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).onNavigationEvent(f);
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void onExtraCallbackWithResult(boolean z) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeInt(z ? 1 : 0);
            if (!this.onWarmupCompleted.transact(46, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).onExtraCallbackWithResult(z);
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void IAuthTabCallback(int i2) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeInt(i2);
            if (!this.onWarmupCompleted.transact(39, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).IAuthTabCallback(i2);
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void IAuthTabCallback(boolean z) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeInt(z ? 1 : 0);
            if (!this.onWarmupCompleted.transact(40, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).IAuthTabCallback(z);
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void onExtraCallbackWithResult(int i2) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeInt(i2);
            if (!this.onWarmupCompleted.transact(48, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).onExtraCallbackWithResult(i2);
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void onExtraCallbackWithResult(@Nullable String str, @Nullable Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeString(str);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.onWarmupCompleted.transact(26, parcelObtain, parcelObtain2, 0) && TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy() != null) {
                ((TabKtExternalSyntheticLambda8) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TabKtExternalSyntheticLambda8.IAuthTabCallback.ICustomTabsCallbackStubProxy())).onExtraCallbackWithResult(str, bundle);
            } else {
                parcelObtain2.readException();
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
