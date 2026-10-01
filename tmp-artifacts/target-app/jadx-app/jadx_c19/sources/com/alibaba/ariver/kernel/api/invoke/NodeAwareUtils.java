package com.alibaba.ariver.kernel.api.invoke;

import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.api.node.NodeAware;
import com.alibaba.exthub.common.ExtHubLogger;
import java.lang.ref.WeakReference;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class NodeAwareUtils {
    public static void handleSetNode(Node node, Extension extension) {
        NodeAware nodeAware;
        Class nodeType;
        if (!(extension instanceof NodeAware) || (nodeType = (nodeAware = (NodeAware) extension).getNodeType()) == null) {
            return;
        }
        for (Node parentNode = node; parentNode != null; parentNode = parentNode.getParentNode()) {
            if (nodeType.isAssignableFrom(parentNode.getClass())) {
                nodeAware.setNode(new WeakReference(parentNode));
                return;
            }
        }
        ExtHubLogger.w("AriverKernel:ExtensionInvoker:Aware", "cannot find Wanted node type: " + nodeType + " with target node: " + node + " in extension " + extension);
    }
}
