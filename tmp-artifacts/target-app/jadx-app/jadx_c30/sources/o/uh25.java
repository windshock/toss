package o;

import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class uh25 {
    private final String IAuthTabCallback_Parcel;
    public static final uh25 onTransact = new uh25("tag:yaml.org,2002:set");
    public static final uh25 onExtraCallbackWithResult = new uh25("tag:yaml.org,2002:binary");
    public static final uh25 IAuthTabCallbackDefault = new uh25("tag:yaml.org,2002:int");
    public static final uh25 onWarmupCompleted = new uh25("tag:yaml.org,2002:float");
    public static final uh25 onNavigationEvent = new uh25("tag:yaml.org,2002:bool");
    public static final uh25 asInterface = new uh25("tag:yaml.org,2002:null");
    public static final uh25 getInterfaceDescriptor = new uh25("tag:yaml.org,2002:str");
    public static final uh25 IAuthTabCallbackStub = new uh25("tag:yaml.org,2002:seq");
    public static final uh25 asBinder = new uh25("tag:yaml.org,2002:map");
    public static final uh25 onExtraCallback = new uh25("tag:yaml.org,2002:comment");
    public static final uh25 IAuthTabCallback = new uh25("!ENV_VARIABLE");

    public uh25(String str) {
        Objects.requireNonNull(str, "Tag must be provided.");
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Tag must not be empty.");
        }
        if (str.trim().length() != str.length()) {
            throw new IllegalArgumentException("Tag must not contain leading or trailing spaces.");
        }
        this.IAuthTabCallback_Parcel = getPaint.IAuthTabCallback(str);
    }

    public uh25(Class<? extends Object> cls) {
        Objects.requireNonNull(cls, "Class for tag must be provided.");
        this.IAuthTabCallback_Parcel = "tag:yaml.org,2002:" + getPaint.IAuthTabCallback(cls.getName());
    }

    public String onNavigationEvent() {
        return this.IAuthTabCallback_Parcel;
    }

    public String toString() {
        return this.IAuthTabCallback_Parcel;
    }

    public boolean equals(Object obj) {
        if (obj instanceof uh25) {
            return this.IAuthTabCallback_Parcel.equals(((uh25) obj).onNavigationEvent());
        }
        return false;
    }

    public int hashCode() {
        return this.IAuthTabCallback_Parcel.hashCode();
    }
}
