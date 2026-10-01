package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getUnreadableElfFiles extends getRegistersOrBuilderList implements getUnreadableElfFilesCount<Character>, access4700<Character> {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static final getUnreadableElfFiles onExtraCallbackWithResult = new getUnreadableElfFiles(1, 0);

    public getUnreadableElfFiles(char c, char c2) {
        super(c, c2, 1);
    }

    @Override // o.getUnreadableElfFilesCount, o.access4700
    public /* synthetic */ boolean contains(Comparable comparable) {
        return onNavigationEvent(((Character) comparable).charValue());
    }

    @Override // o.getUnreadableElfFilesCount, o.access4700
    /* renamed from: asBinder, reason: merged with bridge method [inline-methods] */
    public Character getStart() {
        return Character.valueOf(IAuthTabCallback());
    }

    @Override // o.getUnreadableElfFilesCount
    /* renamed from: IAuthTabCallbackStub, reason: merged with bridge method [inline-methods] */
    public Character getEndInclusive() {
        return Character.valueOf(onNavigationEvent());
    }

    @Override // o.access4700
    /* renamed from: onTransact, reason: merged with bridge method [inline-methods] */
    public Character getEndExclusive() {
        if (onNavigationEvent() == 65535) {
            throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
        }
        return Character.valueOf((char) (onNavigationEvent() + 1));
    }

    public boolean onNavigationEvent(char c) {
        return Intrinsics.compare((int) IAuthTabCallback(), (int) c) <= 0 && Intrinsics.compare((int) c, (int) onNavigationEvent()) <= 0;
    }

    @Override // o.getRegistersOrBuilderList, o.getUnreadableElfFilesCount
    public boolean isEmpty() {
        return Intrinsics.compare((int) IAuthTabCallback(), (int) onNavigationEvent()) > 0;
    }

    @Override // o.getRegistersOrBuilderList
    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof getUnreadableElfFiles)) {
            return false;
        }
        if (isEmpty() && ((getUnreadableElfFiles) obj).isEmpty()) {
            return true;
        }
        getUnreadableElfFiles getunreadableelffiles = (getUnreadableElfFiles) obj;
        return IAuthTabCallback() == getunreadableelffiles.IAuthTabCallback() && onNavigationEvent() == getunreadableelffiles.onNavigationEvent();
    }

    @Override // o.getRegistersOrBuilderList
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (IAuthTabCallback() * 31) + onNavigationEvent();
    }

    @Override // o.getRegistersOrBuilderList
    public String toString() {
        return IAuthTabCallback() + ".." + onNavigationEvent();
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final getUnreadableElfFiles onExtraCallbackWithResult() {
            return getUnreadableElfFiles.onExtraCallbackWithResult;
        }
    }
}
