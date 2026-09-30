package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class deserializeDoubleCollection<T> extends JsonReaderUnknownNumberParsing<T> {
    public abstract void onExtraCallbackWithResult(deserializeFloat<? super deserializeUriNullableCollection> deserializefloat);

    /* JADX WARN: Multi-variable type inference failed */
    private deserializeDoubleCollection<T> readTypedObject() {
        if (!(this instanceof parseDelimitedFrom)) {
            return this;
        }
        parseDelimitedFrom parsedelimitedfrom = (parseDelimitedFrom) this;
        return RxJavaPlugins.onExtraCallbackWithResult((deserializeDoubleCollection) new setMemoryTags(parsedelimitedfrom.ICustomTabsCallback(), parsedelimitedfrom.readTypedObject()));
    }

    public JsonReaderUnknownNumberParsing<T> onExtraCallbackWithResult() {
        return RxJavaPlugins.onExtraCallbackWithResult(new dynamicMethod(readTypedObject()));
    }
}
