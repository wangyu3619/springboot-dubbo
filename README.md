# springboot-dubbo
## 目录结构：
├── common ────────  一些公共的东西  
├── consumer ──────────   消费者端  
├── provider ─────────   服务提供者  
└── provider-api ────  服务契约接口  

## 启动步骤：
### 1.启动zookeeper
### 2.启动provider（服务提供者）
### 3.启动服务consumer去调用dubbo服务
### 4.在浏览器地址框输入 **http://localhost:8081/hello/dubbo**得到结果"hello dubbo"