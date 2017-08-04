<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<!-- Template Name: Clip-One - Responsive Admin Template build with Twitter Bootstrap 3.x Version: 1.3 Author: ClipTheme -->
<!--[if IE 8]><html class="ie8 no-js" lang="en"><![endif]-->
<!--[if IE 9]><html class="ie9 no-js" lang="en"><![endif]-->
<!--[if !IE]><!-->
<html lang="en" class="no-js">
<!--<![endif]-->
<!-- start: HEAD -->
<head>
<base href="<%=basePath%>">
<meta charset="utf-8" />
<title>首页</title>

<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="http://cdn.datatables.net/1.10.15/css/jquery.dataTables.css">
</head>

<body>
	<!-- 导航栏 -->
	<nav class="navbar navbar-default" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">空气质量收集统计平台</a>
			</div>
			<div>
				<ul class="nav navbar-nav">
					<li class="active"><a href="live/cityAirlive">实时数据</a></li>
					<li class=""><a href="live/tomap">空气质量图</a></li>
					<!-- 	<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"> 历史数据 <b class="caret"></b>
					</a>
						<ul class="dropdown-menu">
							<li><a href="#">以年查看</a></li>
							<hr class="hr5" />
							<li><a href="#">以月查看</a></li>
							<hr class="hr5" />
							<li><a href="#">以年查看</a></li>

						</ul></li> -->
				</ul>
			</div>
		</div>
	</nav>
	<div class="row">
		<div
			class="col-lg-10 col-lg-offset-1 col-md-10 col-md-offset-1 col-sm-10 col-sm-offset-1">
			<table id="example" class="table table-striped table-hover">
				<thead>
					<tr class="center">
						<th>排名</th>
						<th>空气质量指数</th>
						<th>城市</th>
						<th>PM2.5浓度(μg/m<sup>3</sup>)
						</th>
						<th>PM 10浓度(μg/m<sup>3</sup>)
						</th>
						<th>一氧化碳浓度(mg/m<sup>3</sup>)
						</th>
						<th>二氧化氮浓度(μg/m<sup>3</sup>)
						</th>
						<th>臭氧浓度(μg/m<sup>3</sup>)
						</th>
						<th>二氧化硫浓度(μg/m<sup>3</sup>)
						</th>
						<th>首要污染物</th>
						<th>时间点</th>
					</tr>
				</thead>
				<tbody id="tablebody">
					<c:forEach items="${list}" var="a" varStatus="status">
						<tr>
							<td>${status.index+1 }</td>
							<c:if test="${a.aqi < 51}">
								<td class="aqi1">${a.aqi}</td>
								<td class="aqi1">${a.city.cityname}</td>
							</c:if>
							<c:if test="${a.aqi > 50 && a.aqi < 101}">
								<td class="aqi2">${a.aqi}</td>
								<td class="aqi2">${a.city.cityname}</td>
							</c:if>
							<c:if test="${a.aqi > 100 && a.aqi < 151}">
								<td class="aqi3">${a.aqi}</td>
								<td class="aqi3">${a.city.cityname}</td>
							</c:if>
							<c:if test="${a.aqi > 150 && a.aqi < 201}">
								<td class="aqi4">${a.aqi}</td>
								<td class="aqi4">${a.city.cityname}</td>
							</c:if>
							<c:if test="${a.aqi > 200 && a.aqi < 301}">
								<td class="aqi5">${a.aqi}</td>
								<td class="aqi5">${a.city.cityname}</td>
							</c:if>
							<c:if test="${a.aqi > 300}">
								<td class="aqi6">${a.aqi}</td>
								<td class="aqi6">${a.city.cityname}</td>
							</c:if>
							<td>${a.pm25}</td>
							<td>${a.pm10}</td>
							<td>${a.co}</td>
							<td>${a.no2}</td>
							<td>${a.o3}</td>
							<td>${a.so2}</td>
							<td>${a.primary}</td>
							<td><fmt:formatDate value='${a.time}'
									pattern='yyyy年MM月dd日HH时' /></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</body>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" charset="utf8"
	src="http://cdn.datatables.net/1.10.15/js/jquery.dataTables.js"></script>

</html>