package pt.flow.decision;

import pt.flow.decision.core.AbstractNode;

/**
 * Specific implementation of a note that ends a flow. Its jump function does
 * not recursively call other nodes jump function. This node does not support
 * links to other nodes.
 *
 * @param <ANSWER_TYPE>
 * @param <CONTEXT_TYPE>
 * @author Márcio Neves
 */
public class LeafNode<ANSWER_TYPE, CONTEXT_TYPE> extends AbstractNode<ANSWER_TYPE, CONTEXT_TYPE> {

    public LeafNode(String name) {
        super(name);
    }

    @Override
    public CONTEXT_TYPE jump(CONTEXT_TYPE context) {
        context = super.jump(context);
        this.getLogic().execute(context);
        return context;
    }


}
