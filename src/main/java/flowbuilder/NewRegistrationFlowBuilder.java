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
public class NewRegistrationFlowBuilder implements Serializable {

    @Produces
    @FlowDefinition
    public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder) {
        String flowId = "newregistration";
        flowBuilder.id("", flowId);
//        flowBuilder.viewNode(flowId,"/newregistration/newregistration.xhtml").markAsStartNode();
        flowBuilder.viewNode(flowId, "/" + flowId + "/" + flowId + ".xhtml").markAsStartNode();
        flowBuilder.viewNode(flowId, "/" + flowId + "/" + flowId + "2.xhtml").markAsStartNode();
        flowBuilder.viewNode(flowId, "/" + flowId + "/" + flowId + "3.xhtml").markAsStartNode();
//        flowBuilder.switchNode("newregistrationPage2").defaultOutcome(flowId).fromOutcome( flowId + "2");
        flowBuilder.flowCallNode("callNewPendencies").flowReference("", "newpendencies").outboundParameter("userName", "#{testeFlowBuilderBean.nome}").outboundParameter("userSurname", "#{testeFlowBuilderBean.sobrenome}");;
        flowBuilder.returnNode("exitToInicio").fromOutcome("/inicioflow.xhtml");
        flowBuilder.returnNode("exitToIndex").fromOutcome("/index.xhtml");
        return flowBuilder.getFlow();
    }
}
