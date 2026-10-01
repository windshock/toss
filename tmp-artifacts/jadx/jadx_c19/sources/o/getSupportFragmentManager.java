package o;

import java.io.Serializable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class getSupportFragmentManager implements Serializable {
    private static final long serialVersionUID = 1;
    private final String arrayEmptySeparator;
    private final char arrayValueSeparator;
    private final onExtraCallbackWithResult arrayValueSpacing;
    private final String objectEmptySeparator;
    private final char objectEntrySeparator;
    private final onExtraCallbackWithResult objectEntrySpacing;
    private final char objectFieldValueSeparator;
    private final onExtraCallbackWithResult objectFieldValueSpacing;
    private final String rootSeparator;

    public enum onExtraCallbackWithResult {
        NONE("", ""),
        BEFORE(" ", ""),
        AFTER("", " "),
        BOTH(" ", " ");

        private final String spacesAfter;
        private final String spacesBefore;

        onExtraCallbackWithResult(String str, String str2) {
            this.spacesBefore = str;
            this.spacesAfter = str2;
        }

        public String spacesBefore() {
            return this.spacesBefore;
        }

        public String spacesAfter() {
            return this.spacesAfter;
        }

        public String apply(char c) {
            return this.spacesBefore + c + this.spacesAfter;
        }
    }

    public static getSupportFragmentManager onWarmupCompleted() {
        return new getSupportFragmentManager();
    }

    public getSupportFragmentManager() {
        this(':', ',', ',');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public getSupportFragmentManager(char c, char c2, char c3) {
        onExtraCallbackWithResult onextracallbackwithresult = onExtraCallbackWithResult.BOTH;
        onExtraCallbackWithResult onextracallbackwithresult2 = onExtraCallbackWithResult.NONE;
        this(" ", c, onextracallbackwithresult, c2, onextracallbackwithresult2, " ", c3, onextracallbackwithresult2, " ");
    }

    public getSupportFragmentManager(String str, char c, onExtraCallbackWithResult onextracallbackwithresult, char c2, onExtraCallbackWithResult onextracallbackwithresult2, String str2, char c3, onExtraCallbackWithResult onextracallbackwithresult3, String str3) {
        this.rootSeparator = str;
        this.objectFieldValueSeparator = c;
        this.objectFieldValueSpacing = onextracallbackwithresult;
        this.objectEntrySeparator = c2;
        this.objectEntrySpacing = onextracallbackwithresult2;
        this.objectEmptySeparator = str2;
        this.arrayValueSeparator = c3;
        this.arrayValueSpacing = onextracallbackwithresult3;
        this.arrayEmptySeparator = str3;
    }

    public getSupportFragmentManager onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult) {
        return this.objectFieldValueSpacing == onextracallbackwithresult ? this : new getSupportFragmentManager(this.rootSeparator, this.objectFieldValueSeparator, onextracallbackwithresult, this.objectEntrySeparator, this.objectEntrySpacing, this.objectEmptySeparator, this.arrayValueSeparator, this.arrayValueSpacing, this.arrayEmptySeparator);
    }

    public String onTransact() {
        return this.rootSeparator;
    }

    public char asBinder() {
        return this.objectFieldValueSeparator;
    }

    public onExtraCallbackWithResult asInterface() {
        return this.objectFieldValueSpacing;
    }

    public char IAuthTabCallbackDefault() {
        return this.objectEntrySeparator;
    }

    public onExtraCallbackWithResult IAuthTabCallbackStub() {
        return this.objectEntrySpacing;
    }

    public String onExtraCallback() {
        return this.objectEmptySeparator;
    }

    public char IAuthTabCallback() {
        return this.arrayValueSeparator;
    }

    public onExtraCallbackWithResult onNavigationEvent() {
        return this.arrayValueSpacing;
    }

    public String onExtraCallbackWithResult() {
        return this.arrayEmptySeparator;
    }
}
