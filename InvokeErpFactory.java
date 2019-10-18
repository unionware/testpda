package com.unionware.adapter;


public class InvokeErpFactory {
	public static final String ERP_TYPE_EAS="EAS";
	public static final String ERP_TYPE_CLOUD="CLOUD";
	public static final String ERP_TYPE_K3="K3";
	public static final String ERP_TYPE_UNC="UNC";
	
	public static final String ERP_BIZTYPE_LOGIN="login";  //登录
	public static final String ERP_BIZTYPE_ACCOUNT_LIST="account_list";//账套清单
	
	public static final String ERP_BIZTYPE_MENU_LIST="menu_list"; //PDA 菜单
	
	public static final String ERP_BIZTYPE_QUERY_CAN_BE_TASKLIST="query_bill"; //查询单据
	
	public static final String ERP_BIZTYPE_CREATE_TASKS="create_task"; //创建任务
	public static final String ERP_BIZTYPE_DELETE_TASKS="del_tasks";//删除任务
	public static final String ERP_BIZTYPE_TASKLIST="query_tasks";//查询已有任务
	public static final String ERP_BIZTYPE_GET_TASK="get_task";//查询任务详情
	
	public static final String ERP_BIZTYPE_ONLINE_ANALYTIC="onlineanalytic";//在线解析条码
	public static final String ERP_BIZTYPE_BASEDATA="query_basedata";//基础资料查询
	
	
	public static final String ERP_BIZTYPE_TASKDONE="finishtasks"; //完成任务
	public static final String ERP_BIZTYPE_CREATEBOXUP="createboxup";//装箱？
	
	public static final String ERP_BIZTYPE_QINVERNTORY="query_inventory";//库存查询
	
	public static final String ERP_BIZTYPE_QDOSSIER="queryDossier"; //条码查询
	public static final String ERP_BIZTYPE_ANALYTIC="queryanalytic";//解析规则查询
	

	
	
	
	public static BaseInvokeExec getAgent(String type){
		public static BaseInvokeExec getBizInvokeObj(String bizType,String session,String slnname){
			BaseInvokeExec exec  =null;
			if(ERP_BIZTYPE_QDOSSIER.equals(bizType)){
				if(ERP_TYPE_EAS.equalsIgnoreCase(slnname)){
					  exec = new QueryEasDossierFunction(session);
				  }else if(ERP_TYPE_CLOUD.equalsIgnoreCase(slnname)){
					  exec = new QueryCloudDossierFunction(session);
				  }else if(ERP_TYPE_K3.equalsIgnoreCase(slnname)){
					  exec = new QueryK3DossierFunction(session);
				  }
			}else if(ERP_BIZTYPE_QBARFLOW.equals(bizType)){
				
			}
	}
}
