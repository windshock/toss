package o;

import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import im.toss.features.credit.data.response.MyQuizDetailsResponse;
import im.toss.features.credit.data.response.QuizCta;
import im.toss.features.credit.data.response.QuizHistory;
import im.toss.features.credit.ui.quiz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.RemoteWorkContinuation;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ActivityOnPausePoint {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private final MyQuizDetailsResponse onExtraCallback;
    private final AppExitPoint onExtraCallbackWithResult;
    private final enableActivityMonitorInitFloatOpt onNavigationEvent;
    private final QuizCta onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityOnPausePoint)) {
            return false;
        }
        ActivityOnPausePoint activityOnPausePoint = (ActivityOnPausePoint) obj;
        if (!Intrinsics.areEqual(this.onExtraCallback, activityOnPausePoint.onExtraCallback)) {
            int i2 = IAuthTabCallback + 3;
            IAuthTabCallbackStub = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, activityOnPausePoint.onNavigationEvent)) {
            int i3 = IAuthTabCallback + 1;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onWarmupCompleted, activityOnPausePoint.onWarmupCompleted)) {
            return this.onExtraCallbackWithResult == activityOnPausePoint.onExtraCallbackWithResult;
        }
        int i5 = IAuthTabCallbackStub + 31;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        MyQuizDetailsResponse myQuizDetailsResponse = this.onExtraCallback;
        int iHashCode3 = 0;
        if (myQuizDetailsResponse == null) {
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 63;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 121;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = myQuizDetailsResponse.hashCode();
        }
        enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatopt = this.onNavigationEvent;
        int iHashCode4 = enableactivitymonitorinitfloatopt == null ? 0 : enableactivitymonitorinitfloatopt.hashCode();
        QuizCta quizCta = this.onWarmupCompleted;
        if (quizCta == null) {
            int i7 = IAuthTabCallbackStub + 45;
            IAuthTabCallback = i7 % 128;
            iHashCode2 = i7 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode2 = quizCta.hashCode();
        }
        AppExitPoint appExitPoint = this.onExtraCallbackWithResult;
        if (appExitPoint != null) {
            int i8 = IAuthTabCallback + 69;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            iHashCode3 = appExitPoint.hashCode();
        }
        return (((((iHashCode * 31) + iHashCode4) * 31) + iHashCode2) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditQuizMyPageMainScreenData(quizDetails=" + this.onExtraCallback + ", banner=" + this.onNavigationEvent + ", cta=" + this.onWarmupCompleted + ", ctaType=" + this.onExtraCallbackWithResult + ")";
        int i2 = IAuthTabCallback + 1;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public ActivityOnPausePoint(@Nullable MyQuizDetailsResponse myQuizDetailsResponse, @Nullable enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatopt, @Nullable QuizCta quizCta, @Nullable AppExitPoint appExitPoint) {
        this.onExtraCallback = myQuizDetailsResponse;
        this.onNavigationEvent = enableactivitymonitorinitfloatopt;
        this.onWarmupCompleted = quizCta;
        this.onExtraCallbackWithResult = appExitPoint;
    }

    public final MyQuizDetailsResponse asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 33;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        MyQuizDetailsResponse myQuizDetailsResponse = this.onExtraCallback;
        int i5 = i2 + 13;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return myQuizDetailsResponse;
    }

    public final enableActivityMonitorInitFloatOpt onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onNavigationEvent;
        }
        throw null;
    }

    public final QuizCta onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 89;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        QuizCta quizCta = this.onWarmupCompleted;
        int i5 = i3 + 69;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return quizCta;
    }

    public final AppExitPoint onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final QuizHistory IAuthTabCallbackStub() {
        int i = 2 % 2;
        MyQuizDetailsResponse myQuizDetailsResponse = this.onExtraCallback;
        if (myQuizDetailsResponse != null) {
            int i2 = IAuthTabCallbackStub + 103;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                myQuizDetailsResponse.asBinder();
                throw null;
            }
            List listAsBinder = myQuizDetailsResponse.asBinder();
            if (listAsBinder != null) {
                int i3 = IAuthTabCallbackStub + 107;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                QuizHistory quizHistory = (QuizHistory) CollectionsKt.firstOrNull(listAsBinder);
                if (i4 == 0) {
                    return quizHistory;
                }
                throw null;
            }
        }
        return null;
    }

    public final List<QuizHistory> onExtraCallback() {
        List listAsBinder;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        MyQuizDetailsResponse myQuizDetailsResponse = this.onExtraCallback;
        Object obj = null;
        if (myQuizDetailsResponse != null && (listAsBinder = myQuizDetailsResponse.asBinder()) != null) {
            int i4 = IAuthTabCallbackStub + 63;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            List<QuizHistory> listDrop = CollectionsKt.drop(listAsBinder, 1);
            if (listDrop != null) {
                int i6 = IAuthTabCallback + 97;
                IAuthTabCallbackStub = i6 % 128;
                if (i6 % 2 != 0) {
                    return listDrop;
                }
                obj.hashCode();
                throw null;
            }
        }
        List<QuizHistory> listEmptyList = CollectionsKt.emptyList();
        int i7 = IAuthTabCallbackStub + 83;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return listEmptyList;
        }
        throw null;
    }

    public final boolean asBinder() {
        List listAsBinder;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        MyQuizDetailsResponse myQuizDetailsResponse = this.onExtraCallback;
        if (myQuizDetailsResponse != null && (listAsBinder = myQuizDetailsResponse.asBinder()) != null) {
            int i4 = IAuthTabCallback + 9;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            int size = listAsBinder.size();
            int i6 = IAuthTabCallback + 53;
            int i7 = i6 % 128;
            IAuthTabCallbackStub = i7;
            int i8 = i6 % 2;
            if (size > 1) {
                int i9 = i7 + 113;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                return true;
            }
        }
        int i11 = IAuthTabCallback + 103;
        IAuthTabCallbackStub = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public final boolean onTransact() {
        List listAsBinder;
        int i = 2 % 2;
        MyQuizDetailsResponse myQuizDetailsResponse = this.onExtraCallback;
        if (myQuizDetailsResponse == null || (listAsBinder = myQuizDetailsResponse.asBinder()) == null) {
            int i2 = IAuthTabCallbackStub + 19;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 81 / 0;
            }
            return true;
        }
        int i4 = IAuthTabCallbackStub + 59;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        boolean zIsEmpty = listAsBinder.isEmpty();
        if (i5 != 0) {
            int i6 = 22 / 0;
        }
        return zIsEmpty;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<RemoteWorkContinuation> IAuthTabCallback() {
        List listEmptyList;
        int i = 2 % 2;
        List listListOf = CollectionsKt.listOf(new RemoteWorkContinuation.onExtraCallback(AFj1rSDK.onExtraCallback.onExtraCallbackWithResult(R.string.credit_quiz_disclaimer_title)));
        MyQuizDetailsResponse myQuizDetailsResponse = this.onExtraCallback;
        if (myQuizDetailsResponse != null) {
            int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            listEmptyList = (List) MyQuizDetailsResponse.onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 88890384, new Object[]{myQuizDetailsResponse}, -88890382, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
                int i2 = IAuthTabCallback + 71;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
            }
        }
        List list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        int i4 = IAuthTabCallbackStub + 19;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 4;
        }
        while (it.hasNext()) {
            arrayList.add(new RemoteWorkContinuation.onNavigationEvent((String) it.next(), 0.0f, false, 6, null));
        }
        List<RemoteWorkContinuation> listPlus = CollectionsKt.plus(listListOf, arrayList);
        int i6 = IAuthTabCallback + 25;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            return listPlus;
        }
        throw null;
    }
}
