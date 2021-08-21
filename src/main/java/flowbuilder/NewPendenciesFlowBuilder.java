package flowbuilder;

import javax.enterprise.inject.Produces;
import javax.faces.flow.Flow;
import javax.faces.flow.builder.FlowBuilder;
import javax.faces.flow.builder.FlowBuilderParameter;
import javax.faces.flow.builder.FlowDefinition;
import java.io.Serializable;

/**
 * Created by const on 20/08/2021.
 */
public class NewPendenciesFlowBuilder implements Serializable{
    @Produces
    @FlowDefinition
    public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder) {
        String flowId = "newpendencies";
        flowBuilder.id("", flowId);
        flowBuilder.viewNode(flowId, "/" + flowId + "/" + flowId + ".xhtml").markAsStartNode();
        flowBuilder.returnNode("exitToInicio").fromOutcome("/newregistration/newregistration3.xhtml");
    flowBuilder.inboundParameter("userName","#{testeFlowBuilderNested.userName}");
    flowBuilder.inboundParameter("userName","#{testeFlowBuilderNested.userSurname}");
        return flowBuilder.getFlow();
    }
}
