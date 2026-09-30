package o;

import android.location.Location;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileDescriptor;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class addOnChildAttachStateChangeListener {
    private final int IAuthTabCallback;
    private final int IAuthTabCallbackDefault;
    private final FileDescriptor IAuthTabCallbackStub;
    private final long IAuthTabCallbackStubProxy;
    private final int IAuthTabCallback_Parcel;
    private final considerReleasingGlowsOnScroll access000;
    private final removeOnChildAttachStateChangeListener access100;
    private final File asBinder;
    private final Location asInterface;
    private final int getInterfaceDescriptor;
    private final int onExtraCallback;
    private final addOnItemTouchListener onExtraCallbackWithResult;
    private final addItemDecoration onNavigationEvent;
    private final boolean onTransact;
    private final clearOldPositions onWarmupCompleted;
    private final int writeTypedObject;

    public addOnChildAttachStateChangeListener(@NonNull onWarmupCompleted onwarmupcompleted) {
        this.onTransact = onwarmupcompleted.asInterface;
        this.asInterface = onwarmupcompleted.onTransact;
        this.getInterfaceDescriptor = onwarmupcompleted.IAuthTabCallbackStubProxy;
        this.access100 = onwarmupcompleted.access100;
        this.asBinder = onwarmupcompleted.asBinder;
        this.IAuthTabCallbackStub = onwarmupcompleted.IAuthTabCallbackStub;
        this.onWarmupCompleted = onwarmupcompleted.onWarmupCompleted;
        this.access000 = onwarmupcompleted.IAuthTabCallback_Parcel;
        this.onExtraCallbackWithResult = onwarmupcompleted.onNavigationEvent;
        this.onNavigationEvent = onwarmupcompleted.onExtraCallbackWithResult;
        this.IAuthTabCallbackStubProxy = onwarmupcompleted.access000;
        this.IAuthTabCallbackDefault = onwarmupcompleted.IAuthTabCallbackDefault;
        this.onExtraCallback = onwarmupcompleted.onExtraCallback;
        this.IAuthTabCallback_Parcel = onwarmupcompleted.getInterfaceDescriptor;
        this.writeTypedObject = onwarmupcompleted.writeTypedObject;
        this.IAuthTabCallback = onwarmupcompleted.IAuthTabCallback;
    }
}
