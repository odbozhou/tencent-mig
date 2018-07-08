## 腾讯MIG招聘api接口文档
### 运行要求

*JDK 1.8

*mysql

### 数据库配置

    修改tencent-mig\src\main\resources\application.properties配置文件
    修改IP
    spring.datasource.druid.url=jdbc:mysql://IP:3306/db_tencent_mig?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull
    IP替换数据库主机
    
    修改账号
    spring.datasource.druid.username=账号
    "账号"替换为数据库用户    
    
    修改密码
    spring.datasource.druid.password=密码
    "密码"替换为数据库密码
    
    
### 运行命令

    nohub java -jar tencent-mig-0.0.1-SNAPSHOT.jar -Dserver.port=8888 &

    -Dserver.port=8888 设置服务监听端口

### 接口文档说明

    http://127.0.0.1:8888 替换为服务端映射域名
    
    返回数据格式
    	{
    	
    	    "code": code码,
    	    "data": 返回数据，
    	    "msg" : 错误信息
    	    }
    	
    	}
    code = 0 表示返回成功，其他返回码为失败，并且返回msg 错误信息。

#### 01.获取地区信息

**接口调用请求说明**

	http请求方式: GET
	http://127.0.0.1:8888/region/getAll

**返回结果**

正确的Json返回结果：

	{
	
	    "code": 0,
	    "data": [
	        {
	            "id": "33",
	            "name": "美国"
	        },
	        {
	            "id": "66",
	            "name": "印度尼西亚"
	        },
	        {
	            "id": "45",
	            "name": "泰国"
	        },
	        {
	            "id": "59",
	            "name": "日本"
	        },
	        {
	            "id": "2320",
	            "name": "合肥"
	        },
	        {
	            "id": "2175",
	            "name": "上海"
	        },
	        {
	            "id": "2252",
	            "name": "杭州"
	        },
	        {
	            "id": "2461",
	            "name": "台湾"
	        },
	        {
	            "id": "2196",
	            "name": "广州"
	        },
	        {
	            "id": "2280",
	            "name": "海口"
	        },
	        {
	            "id": "2218",
	            "name": "深圳"
	        },
	        {
	            "id": "2426",
	            "name": "昆明"
	        },
	        {
	            "id": "2459",
	            "name": "香港"
	        },
	        {
	            "id": "2228",
	            "name": "南京"
	        },
	        {
	            "id": "2346",
	            "name": "郑州"
	        },
	        {
	            "id": "2225",
	            "name": "天津"
	        },
	        {
	            "id": "2268",
	            "name": "成都"
	        },
	        {
	            "id": "2355",
	            "name": "武汉"
	        },
	        {
	            "id": "2156",
	            "name": "北京"
	        },
	        {
	            "id": "90",
	            "name": "荷兰"
	        },
	        {
	            "id": "60",
	            "name": "马来西亚"
	        },
	        {
	            "id": "2418",
	            "name": "长春"
	        }
	    ]
	
	}

结果说明：

<table width="100%" style="border-spacing: 0;  border-collapse: collapse;">
	<tbody>
		<tr>
			<th width="16%">字段名称</th>
			<th width="11%">字段类型</th>
			<th width="62%">字段说明</th>
		</tr>
		<tr>
		 	<td>id</td>
			<td>string</td>
			<td>地区id</td>
		</tr>
		<tr>
		 	<td>name</td>
			<td>string</td>
			<td>地区名称</td>
		</tr>
	</tbody>
</table>    

---------

#### 02.获取职位类别信息

**接口调用请求说明**

	http请求方式: GET
	http://127.0.0.1:8888/category/getAll

**返回结果**

正确的Json返回结果：

	{
	
	    "code": 0,
	    "data": [
	        {
	            "id": "81",
	            "name": "设计类"
	        },
	        {
	            "id": "82",
	            "name": "产品/项目类"
	        },
	        {
	            "id": "83",
	            "name": "市场类"
	        },
	        {
	            "id": "84",
	            "name": "职能类"
	        },
	        {
	            "id": "85",
	            "name": "内容编辑类"
	        },
	        {
	            "id": "86",
	            "name": "客户服务类"
	        },
	        {
	            "id": "87",
	            "name": "技术类"
	        }
	    ]
	}
结果说明：

<table width="100%" style="border-spacing: 0;  border-collapse: collapse;">
	<tbody>
		<tr>
			<th width="16%">字段名称</th>
			<th width="11%">字段类型</th>
			<th width="62%">字段说明</th>
		</tr>
		<tr>
		 	<td>id</td>
			<td>string</td>
			<td>职位类别id</td>
		</tr>
		<tr>
		 	<td>name</td>
			<td>string</td>
			<td>职位类别名称</td>
		</tr>
	</tbody>
</table>    

---------

#### 03.获取职位列表

**接口调用请求说明**

	http请求方式: GET
	http://127.0.0.1:8888/job/getPagerList
	
**参数说明**

<table width="100%" style="border-spacing: 0;  border-collapse: collapse;">
	<tbody>
		<tr>
			<th width="16%">参数名称</th>
			<th width="11%">是否必须</th>
			<th width="11%">字段类型</th>
			<th width="62%">参数说明</th>
		</tr>
		<tr>
			<td>regionId</td>
			<td>否</td>
			<td>string</td>
			<td>地区id</td>
		</tr>
		<tr>
			<td>categoryId</td>
			<td>否</td>
			<td>string</td>
			<td>职位类别id</td>
		</tr>
	    <tr>
			<td>pageRows</td>
			<td>否</td>
			<td>number</td>
			<td>分页时每页记录数（默认20条）</td>
		</tr>
		<tr>
			<td>pageIndex</td>
			<td>否</td>
			<td>number</td>
			<td>当前页</td>
		</tr>
	</tbody>
</table>

**返回结果**

正确的Json返回结果：

{
	
	    "code": 0,
	    "data": {
	        "list": [
	            {
	                "id": "42184",
	                "title": "MIG16-地图检索机器学习算法高级研发工程师（北京）",
	                "regionId": "2156",
	                "regionName": "北京",
	                "categoryId": "87",
	                "categoryName": "技术类",
	                "recruitingNumbers": 1,
	                "isUrgentlySeeking": 0,
	                "createTime": "2018-07-05T22:35:40.000+0000",
	                "requirment": null,
	                "responsibility": null
	            },
	            {
	                "id": "42112",
	                "title": "MIG16-Android开发工程师(北京)",
	                "regionId": "2156",
	                "regionName": "北京",
	                "categoryId": "87",
	                "categoryName": "技术类",
	                "recruitingNumbers": 1,
	                "isUrgentlySeeking": 0,
	                "createTime": "2018-07-05T22:35:28.000+0000",
	                "requirment": null,
	                "responsibility": null
	            },
	            {
	                "id": "41816",
	                "title": "MIG16-自动驾驶仿真模拟系统-服务器工程师",
	                "regionId": "2156",
	                "regionName": "北京",
	                "categoryId": "87",
	                "categoryName": "技术类",
	                "recruitingNumbers": 1,
	                "isUrgentlySeeking": 0,
	                "createTime": "2018-07-05T22:34:42.000+0000",
	                "requirment": null,
	                "responsibility": null
	            }
	        ],
	        "pager": {
	            "totalRows": 104,
	            "pageRows": 3,
	            "pageIndex": 1,
	            "paged": false,
	            "pageStartRow": 0,
	            "defaultPageRows": 20,
	            "totalPages": 35,
	            "pageEndRow": 2,
	            "hasPrevPage": false,
	            "currPageRows": 3,
	            "hasNextPage": true
	        }
	    }
	
	}
	
**结果说明**
<table width="100%" style="border-spacing: 0;  border-collapse: collapse;">

	    <tr>
			<th width="18%">字段名称</th>
			<th width="11%">字段类型</th>
	  		<th>字段说明</th>
	    </tr>
	    <tr>
			<td>pager</td>
			<td>object</td>
			<td colspan='2'>分页信息</td>
		</tr>
 		<tr>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;totalRows</td>
			<td>number</td>
			<td>数据总行数</td>
		</tr>
    	<tr>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;pageRows</td>
			<td>number</td>
			<td>一页显示的行数</td>
		</tr>
    	<tr>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;pageIndex</td>
			<td>number</td>
			<td>页码</td>
		</tr>
    	<tr>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;totalPages</td>
			<td>number</td>
			<td>总页数</td>
		</tr>
    	<tr>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;pageEndRow</td>
			<td>number</td>
			<td>当前页在总行数中的结束位置</td>
		</tr>
    	<tr>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;hasPrevPage</td>
			<td>boolean</td>
			<td>是否有上一页</td>
		</tr>
    	<tr>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;pageStartRow</td>
			<td>number</td>
			<td>当前页在总行数中的开始位置</td>
		</tr>
    	<tr>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;defaultPageRows</td>
			<td>number</td>
			<td>默认每页行数</td>
		</tr>
    	<tr>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;hasNextPage</td>
			<td>number</td>
			<td>是否有下一页</td>
		</tr>
    	<tr>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;currPageRows</td>
			<td>number</td>
			<td>实际当前页行数</td>
		</tr>
 		<tr>
		  		<td>list</td>
				<td>list</td>
		  		<td>测肤记录列表</td>
		</tr>
 	      <tr>
		  		<td>&nbsp;&nbsp;&nbsp;&nbsp;id</td>
				<td>string</td>
		  		<td>职位ID</td>
		  </tr>
           <tr>
		  		<td>&nbsp;&nbsp;&nbsp;&nbsp;title</td>
				<td>string</td>
		  		<td>职位标题</td>
		  </tr>
          <tr>
		  		<td>&nbsp;&nbsp;&nbsp;&nbsp;regionId</td>
				<td>string</td>
		  		<td>地区ID</td>
		  </tr>         
		   <tr>
		  		<td>&nbsp;&nbsp;&nbsp;&nbsp;regionName</td>
				<td>string</td>
		  		<td>地区名称</td>
		  </tr>          
		  <tr>
		  		<td>&nbsp;&nbsp;&nbsp;&nbsp;categoryId</td>
				<td>string</td>
		  		<td>职位类型ID</td>
		  </tr>         
		   <tr>
		  		<td>&nbsp;&nbsp;&nbsp;&nbsp;categoryName</td>
				<td>string</td>
		  		<td>职位类型名称</td>
		  </tr>		   
		  <tr>
		  		<td>&nbsp;&nbsp;&nbsp;&nbsp;recruitingNumbers</td>
				<td>string</td>
		  		<td>招聘人数</td>
		  </tr>          
		  <tr>
		  		<td>&nbsp;&nbsp;&nbsp;&nbsp;isUrgentlySeeking</td>
				<td>string</td>
		  		<td>是否急聘（ 0-非急招，1-非急招）</td>
		  </tr>         
		   <tr>
		  		<td>&nbsp;&nbsp;&nbsp;&nbsp;createTime</td>
				<td>string</td>
		  		<td>创建时间，格式样例："2018-07-05T22:34:42.000+0000"</td>
		  </tr>
</table>


---------

#### 04.根据职位地点名称职位搜索

**接口调用请求说明**

	http请求方式: GET
	http://127.0.0.1:8888/job/search
	
**参数说明**

<table width="100%" style="border-spacing: 0;  border-collapse: collapse;">
	<tbody>
		<tr>
			<th width="16%">参数名称</th>
			<th width="11%">是否必须</th>
			<th width="11%">字段类型</th>
			<th width="62%">参数说明</th>
		</tr>
		<tr>
			<td>searchKey</td>
			<td>否</td>
			<td>string</td>
			<td>搜索关键字</td>
		</tr>
		</tr>
	    <tr>
			<td>pageRows</td>
			<td>否</td>
			<td>number</td>
			<td>分页时每页记录数（默认20条）</td>
		</tr>
		<tr>
			<td>pageIndex</td>
			<td>否</td>
			<td>number</td>
			<td>当前页</td>
		</tr>
	</tbody>
</table>

**返回结果**

正确的Json返回结果：

{
	
	    "code": 0,
	    "data": {
	        "list": [
	            {
	                "id": "42184",
	                "title": "MIG16-地图检索机器学习算法高级研发工程师（北京）",
	                "regionId": "2156",
	                "regionName": "北京",
	                "categoryId": "87",
	                "categoryName": "技术类",
	                "recruitingNumbers": 1,
	                "isUrgentlySeeking": 0,
	                "createTime": "2018-07-05T22:35:40.000+0000",
	                "requirment": null,
	                "responsibility": null
	            },
	            {
	                "id": "42112",
	                "title": "MIG16-Android开发工程师(北京)",
	                "regionId": "2156",
	                "regionName": "北京",
	                "categoryId": "87",
	                "categoryName": "技术类",
	                "recruitingNumbers": 1,
	                "isUrgentlySeeking": 0,
	                "createTime": "2018-07-05T22:35:28.000+0000",
	                "requirment": null,
	                "responsibility": null
	            },
	            {
	                "id": "41816",
	                "title": "MIG16-自动驾驶仿真模拟系统-服务器工程师",
	                "regionId": "2156",
	                "regionName": "北京",
	                "categoryId": "87",
	                "categoryName": "技术类",
	                "recruitingNumbers": 1,
	                "isUrgentlySeeking": 0,
	                "createTime": "2018-07-05T22:34:42.000+0000",
	                "requirment": null,
	                "responsibility": null
	            }
	        ],
	        "pager": {
	            "totalRows": 104,
	            "pageRows": 3,
	            "pageIndex": 1,
	            "paged": false,
	            "pageStartRow": 0,
	            "defaultPageRows": 20,
	            "totalPages": 35,
	            "pageEndRow": 2,
	            "hasPrevPage": false,
	            "currPageRows": 3,
	            "hasNextPage": true
	        }
	    }
	
	}
	
**结果说明**
<table width="100%" style="border-spacing: 0;  border-collapse: collapse;">

	    <tr>
			<th width="18%">字段名称</th>
			<th width="11%">字段类型</th>
	  		<th>字段说明</th>
	    </tr>
	    <tr>
			<td>pager</td>
			<td>object</td>
			<td colspan='2'>分页信息</td>
		</tr>
 		<tr>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;totalRows</td>
			<td>number</td>
			<td>数据总行数</td>
		</tr>
    	<tr>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;pageRows</td>
			<td>number</td>
			<td>一页显示的行数</td>
		</tr>
    	<tr>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;pageIndex</td>
			<td>number</td>
			<td>页码</td>
		</tr>
    	<tr>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;totalPages</td>
			<td>number</td>
			<td>总页数</td>
		</tr>
    	<tr>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;pageEndRow</td>
			<td>number</td>
			<td>当前页在总行数中的结束位置</td>
		</tr>
    	<tr>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;hasPrevPage</td>
			<td>boolean</td>
			<td>是否有上一页</td>
		</tr>
    	<tr>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;pageStartRow</td>
			<td>number</td>
			<td>当前页在总行数中的开始位置</td>
		</tr>
    	<tr>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;defaultPageRows</td>
			<td>number</td>
			<td>默认每页行数</td>
		</tr>
    	<tr>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;hasNextPage</td>
			<td>number</td>
			<td>是否有下一页</td>
		</tr>
    	<tr>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;currPageRows</td>
			<td>number</td>
			<td>实际当前页行数</td>
		</tr>
 		<tr>
		  		<td>list</td>
				<td>list</td>
		  		<td>测肤记录列表</td>
		</tr>
 	      <tr>
		  		<td>&nbsp;&nbsp;&nbsp;&nbsp;id</td>
				<td>string</td>
		  		<td>职位ID</td>
		  </tr>
           <tr>
		  		<td>&nbsp;&nbsp;&nbsp;&nbsp;title</td>
				<td>string</td>
		  		<td>职位标题</td>
		  </tr>
          <tr>
		  		<td>&nbsp;&nbsp;&nbsp;&nbsp;regionId</td>
				<td>string</td>
		  		<td>地区ID</td>
		  </tr>         
		   <tr>
		  		<td>&nbsp;&nbsp;&nbsp;&nbsp;regionName</td>
				<td>string</td>
		  		<td>地区名称</td>
		  </tr>          
		  <tr>
		  		<td>&nbsp;&nbsp;&nbsp;&nbsp;categoryId</td>
				<td>string</td>
		  		<td>职位类型ID</td>
		  </tr>         
		   <tr>
		  		<td>&nbsp;&nbsp;&nbsp;&nbsp;categoryName</td>
				<td>string</td>
		  		<td>职位类型名称</td>
		  </tr>		   
		  <tr>
		  		<td>&nbsp;&nbsp;&nbsp;&nbsp;recruitingNumbers</td>
				<td>string</td>
		  		<td>招聘人数</td>
		  </tr>          
		  <tr>
		  		<td>&nbsp;&nbsp;&nbsp;&nbsp;isUrgentlySeeking</td>
				<td>string</td>
		  		<td>是否急聘（ 0-非急招，1-非急招）</td>
		  </tr>         
		   <tr>
		  		<td>&nbsp;&nbsp;&nbsp;&nbsp;createTime</td>
				<td>string</td>
		  		<td>创建时间，格式样例："2018-07-05T22:34:42.000+0000"</td>
		  </tr>
</table>

---------

### 05.获取职位详情

**接口调用请求说明**

	http请求方式: GET
    http://127.0.0.1:8888/job/detail
	
**参数说明**

<table width="100%" style="border-spacing: 0;  border-collapse: collapse;">
	<tbody>
		<tr>
			<th width="16%">参数名称</th>
			<th width="11%">是否必须</th>
			<th width="11%">字段类型</th>
			<th width="62%">参数说明</th>
		</tr>
		<tr>
			<td>id</td>
			<td>是</td>
			<td>string</td>
			<td>职位ID</td>
		</tr>
	</tbody>
</table>

**返回结果**

正确的Json返回结果：

	{
	
	    "code": 0,
	    "data": {
	        "id": "42211",
	        "title": "MIG03-腾讯MIG研发部架构师（深圳）",
	        "regionId": "2218",
	        "regionName": "深圳",
	        "categoryId": "87",
	        "categoryName": "技术类",
	        "recruitingNumbers": 1,
	        "isUrgentlySeeking": 0,
	        "createTime": "2018-07-06T22:38:38.000+0000",
	        "requirment": "5年以上工作经验，至少2年以上大型分布式系统架构及开发经验；\n至少精通java/C++其中一门面向对象语言，熟悉linux平台下服务器开发运维能力\n熟悉大容量、高性能、高可用服务开发，对缓存、存储、并发等场景有较好处理经验。\n对业界开源软件有持续关注，并对一些核心组件有过深入的了解；\n逻辑思维清晰，优秀的分析和解决问题的能力，较强的抗压力。\n有相关大数据架构及分析的经验优先。",
	        "responsibility": "负责腾讯移动互联网事业群（MIG）研发部核心业务系统的架构设计和基础平台建设工作； \n参与系统的需求分析、架构设计、核心框架及组件的编码等开发工作；\n持续从技术上提升服务安全性、可用性等技术能力。"
	    }
	
	}
	
**结果说明**
<table width="100%" style="border-spacing: 0;  border-collapse: collapse;">

	    <tr>
			<th width="18%">字段名称</th>
			<th width="11%">字段类型</th>
	  		<th>字段说明</th>
	    </tr>
 	      <tr>
		  		<td>id</td>
				<td>string</td>
		  		<td>职位ID</td>
		  </tr>
           <tr>
		  		<td>title</td>
				<td>string</td>
		  		<td>职位标题</td>
		  </tr>
          <tr>
		  		<td>regionId</td>
				<td>string</td>
		  		<td>地区ID</td>
		  </tr>         
		   <tr>
		  		<td>regionName</td>
				<td>string</td>
		  		<td>地区名称</td>
		  </tr>          
		  <tr>
		  		<td>categoryId</td>
				<td>string</td>
		  		<td>职位类型ID</td>
		  </tr>         
		   <tr>
		  		<td>categoryName</td>
				<td>string</td>
		  		<td>职位类型名称</td>
		  </tr>		   
		  <tr>
		  		<td>recruitingNumbers</td>
				<td>number</td>
		  		<td>招聘人数</td>
		  </tr>          
		  <tr>
		  		<td>isUrgentlySeeking</td>
				<td>string</td>
		  		<td>是否急聘（ 0-非急招，1-非急招）</td>
		  </tr>         
		   <tr>
		  		<td>createTime</td>
				<td>string</td>
		  		<td>创建时间，格式样例："2018-07-05T22:34:42.000+0000"</td>
		  </tr>		 
		   <tr>
		  		<td>isUrgentlySeeking</td>
				<td>string</td>
		  		<td>是否急聘（ 0-非急招，1-非急招）</td>
		  </tr>         
		   <tr>
		  		<td>createTime</td>
				<td>string</td>
		  		<td>创建时间，格式样例：2018-07-05T22:34:42.000+0000</td>
		  </tr>		   
		  <tr>
		  		<td>requirment</td>
				<td>string</td>
		  		<td>职位要求</td>
		  </tr>         
		   <tr>
		  		<td>responsibility</td>
				<td>string</td>
		  		<td>职位职责</td>
		  </tr>
</table>

---------

#### 06.同步招聘信息数据（全量同步）

**接口调用请求说明**

	http请求方式: GET
	http://127.0.0.1:8888/common/sync

**返回结果**

正确的Json返回结果：

	{
	
	    "code": 0,
	    "data": {
	        "sync": 1
	    }
	
	}
	
结果说明：

<table width="100%" style="border-spacing: 0;  border-collapse: collapse;">
	<tbody>
		<tr>
			<th width="16%">字段名称</th>
			<th width="11%">字段类型</th>
			<th width="62%">字段说明</th>
		</tr>
		<tr>
		 	<td>sync</td>
			<td>number</td>
			<td>同步状态（0-同步失败， 1-同步成功）</td>
		</tr>
	</tbody>
</table>    

---------


