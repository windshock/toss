package com.alibaba.ariver.engine.common.extension.bind;

import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.api.node.Scope;
import com.alibaba.exthub.common.ExtHubLogger;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class NodeBinder implements Binder<BindingNode, Node> {
    private static final String TAG = "AriverEngine:NodeBinder";
    private Node sourceNode;

    public NodeBinder(Node node) {
        this.sourceNode = node;
    }

    @Override // com.alibaba.ariver.engine.common.extension.bind.Binder
    public Node bind(Class<Node> cls, BindingNode bindingNode) throws BindException {
        Node nodeFindDataScopeNode = findDataScopeNode(bindingNode.value(), this.sourceNode);
        if (nodeFindDataScopeNode == null) {
            ExtHubLogger.w(TAG, "Cannot find scope for node: " + this.sourceNode + " scope: " + bindingNode.value());
        }
        return nodeFindDataScopeNode;
    }

    public Node findDataScopeNode(Class<? extends Scope> cls, Node node) {
        Class scopeType;
        if (node == null || !(node instanceof Scope) || (scopeType = ((Scope) node).getScopeType()) == null) {
            return null;
        }
        return scopeType.equals(cls) ? node : findDataScopeNode(cls, node.getParentNode());
    }
}
