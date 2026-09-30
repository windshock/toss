package im.toss.features.home.core.model.legacy_consumption.regular;

import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import o.access15300;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RegularExpenseUpdateRequestDto {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final List<Command> onExtraCallback;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegularExpenseUpdateRequestDto)) {
            int i5 = i3 + 23;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, ((RegularExpenseUpdateRequestDto) obj).onExtraCallback)) {
            return false;
        }
        int i7 = onWarmupCompleted + 23;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            iHashCode = this.onExtraCallback.hashCode();
            int i3 = 63 / 0;
        } else {
            iHashCode = this.onExtraCallback.hashCode();
        }
        int i4 = onWarmupCompleted + 33;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RegularExpenseUpdateRequestDto(commands=" + this.onExtraCallback + ")";
        int i2 = onWarmupCompleted + 69;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public RegularExpenseUpdateRequestDto(@NotNull List<Command> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.onExtraCallback = list;
    }

    public final List<Command> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        List<Command> list = this.onExtraCallback;
        int i5 = i3 + 49;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public static final class Command {
        private static int IAuthTabCallbackDefault = 0;
        private static int IAuthTabCallbackStubProxy = 1;
        private final String IAuthTabCallback;
        private final String IAuthTabCallbackStub;
        private final String asBinder;
        private final Operation asInterface;
        private final String onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final long onNavigationEvent;
        private final String onTransact;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 21;
            int i3 = i2 % 128;
            IAuthTabCallbackStubProxy = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Command)) {
                int i5 = i3 + 69;
                IAuthTabCallbackDefault = i5 % 128;
                return i5 % 2 != 0;
            }
            Command command = (Command) obj;
            if (this.asInterface != command.asInterface || !Intrinsics.areEqual(this.onWarmupCompleted, command.onWarmupCompleted) || !Intrinsics.areEqual(this.onExtraCallback, command.onExtraCallback)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.IAuthTabCallback, command.IAuthTabCallback)) {
                int i6 = IAuthTabCallbackStubProxy + 83;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (this.onNavigationEvent != command.onNavigationEvent) {
                int i8 = IAuthTabCallbackStubProxy + 91;
                IAuthTabCallbackDefault = i8 % 128;
                if (i8 % 2 == 0) {
                    return false;
                }
                throw null;
            }
            if (!Intrinsics.areEqual(this.IAuthTabCallbackStub, command.IAuthTabCallbackStub)) {
                int i9 = IAuthTabCallbackDefault + 101;
                IAuthTabCallbackStubProxy = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onTransact, command.onTransact)) {
                int i11 = IAuthTabCallbackDefault + 63;
                IAuthTabCallbackStubProxy = i11 % 128;
                int i12 = i11 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.asBinder, command.asBinder)) {
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallbackWithResult, command.onExtraCallbackWithResult)) {
                return true;
            }
            int i13 = IAuthTabCallbackDefault + 17;
            IAuthTabCallbackStubProxy = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 49;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode3 = this.asInterface.hashCode();
            int iHashCode4 = this.onWarmupCompleted.hashCode();
            int iHashCode5 = this.onExtraCallback.hashCode();
            int iHashCode6 = this.IAuthTabCallback.hashCode();
            int iHashCode7 = Long.hashCode(this.onNavigationEvent);
            int iHashCode8 = this.IAuthTabCallbackStub.hashCode();
            int iHashCode9 = this.onTransact.hashCode();
            String str = this.asBinder;
            if (str == null) {
                int i4 = IAuthTabCallbackStubProxy + 93;
                IAuthTabCallbackDefault = i4 % 128;
                iHashCode = i4 % 2 != 0 ? 1 : 0;
            } else {
                iHashCode = str.hashCode();
            }
            String str2 = this.onExtraCallbackWithResult;
            if (str2 != null) {
                iHashCode2 = str2.hashCode();
                int i5 = IAuthTabCallbackDefault + 105;
                IAuthTabCallbackStubProxy = i5 % 128;
                int i6 = i5 % 2;
            } else {
                iHashCode2 = 0;
            }
            int i7 = (((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode) * 31) + iHashCode2;
            int i8 = IAuthTabCallbackStubProxy + 89;
            IAuthTabCallbackDefault = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 74 / 0;
            }
            return i7;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Command(operation=" + this.asInterface + ", category=" + this.onWarmupCompleted + ", brandName=" + this.onExtraCallback + ", expenseDate=" + this.IAuthTabCallback + ", expenseAmount=" + this.onNavigationEvent + ", imageUrl=" + this.IAuthTabCallbackStub + ", itemType=" + this.onTransact + ", title=" + this.asBinder + ", categorySmall=" + this.onExtraCallbackWithResult + ")";
            int i2 = IAuthTabCallbackDefault + 1;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public Command(@NotNull Operation operation, @NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull String str4, @NotNull String str5, @Nullable String str6, @Nullable String str7) {
            Intrinsics.checkNotNullParameter(operation, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.asInterface = operation;
            this.onWarmupCompleted = str;
            this.onExtraCallback = str2;
            this.IAuthTabCallback = str3;
            this.onNavigationEvent = j;
            this.IAuthTabCallbackStub = str4;
            this.onTransact = str5;
            this.asBinder = str6;
            this.onExtraCallbackWithResult = str7;
        }

        public final Operation onTransact() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 5;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                return this.asInterface;
            }
            throw null;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 21;
            int i3 = i2 % 128;
            IAuthTabCallbackStubProxy = i3;
            int i4 = i2 % 2;
            String str = this.onWarmupCompleted;
            int i5 = i3 + 89;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onWarmupCompleted() {
            String str;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 121;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 == 0) {
                str = this.onExtraCallback;
                int i4 = 23 / 0;
            } else {
                str = this.onExtraCallback;
            }
            int i5 = i2 + 95;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onExtraCallback() {
            String str;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 111;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 == 0) {
                str = this.IAuthTabCallback;
                int i4 = 2 / 0;
            } else {
                str = this.IAuthTabCallback;
            }
            int i5 = i2 + 111;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 97 / 0;
            }
            return str;
        }

        public final long onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 123;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 65;
            int i3 = i2 % 128;
            IAuthTabCallbackStubProxy = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = this.IAuthTabCallbackStub;
            int i4 = i3 + 73;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 82 / 0;
            }
            return str;
        }

        public final String asInterface() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 51;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onTransact;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String asBinder() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 87;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            String str = this.asBinder;
            int i5 = i3 + 23;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 12 / 0;
            }
            return str;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy;
            int i3 = i2 + 83;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onExtraCallbackWithResult;
            int i5 = i2 + 23;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Operation {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Operation[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;
        public static final Operation ADD = new Operation("ADD", 0);
        public static final Operation REMOVE = new Operation("REMOVE", 1);

        private static final /* synthetic */ Operation[] $values() {
            Operation[] operationArr;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                Operation operation = ADD;
                Operation operation2 = REMOVE;
                operationArr = new Operation[5];
                operationArr[0] = operation;
                operationArr[1] = operation2;
            } else {
                operationArr = new Operation[]{ADD, REMOVE};
            }
            int i4 = i3 + 27;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return operationArr;
        }

        public static EnumEntries<Operation> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            EnumEntries<Operation> enumEntries = $ENTRIES;
            if (i3 == 0) {
                int i4 = 91 / 0;
            }
            return enumEntries;
        }

        public static Operation valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 83;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Operation operation = (Operation) Enum.valueOf(Operation.class, str);
            if (i3 != 0) {
                int i4 = 55 / 0;
            }
            return operation;
        }

        public static Operation[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Operation[] operationArr = $VALUES;
            if (i3 == 0) {
                return (Operation[]) operationArr.clone();
            }
            int i4 = 23 / 0;
            return (Operation[]) operationArr.clone();
        }

        private Operation(String str, int i) {
        }

        static {
            Operation[] operationArr$values = $values();
            $VALUES = operationArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(operationArr$values);
            int i = onNavigationEvent + 85;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }
    }
}
