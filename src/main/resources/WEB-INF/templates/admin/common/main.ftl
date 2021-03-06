<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html;charset=utf-8" />
<title>${message("admin.index.title")} - Powered By JFinalShop</title>
<meta name="author" content="JFinalShop Team" />
<meta name="copyright" content="JFinalShop" />
<link href="${base}/resources/admin/css/common.css" rel="stylesheet" type="text/css" />
<link href="${base}/resources/admin/css/index.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${base}/resources/admin/js/jquery.js"></script>
</head>
<body>
	<table class="index">
		<tr>
			<td>
				<div class="breadcrumb">
					${message("admin.index.title")}
				</div>
				<table class="input">
					<tr>
						<th>
							${message("admin.index.systemName")}:
						</th>
						<td>
							${systemName}
							<a href="http://www.shopec.net" class="silver" target="_blank"></a>
						</td>
						<th>
							${message("admin.index.systemVersion")}:
						</th>
						<td>
							${systemVersion}
						</td>
					</tr>
					<tr>
						<th>
							${message("admin.index.official")}:
						</th>
						<td>
							<a href="http://www.shopec.net" target="_blank">http://www.shopec.net</a>
						</td>
						<th>
							${message("admin.index.bbs")}:
						</th>
						<td>
							<a href="http://bbs.shopec.net" target="_blank">http://bbs.shopec.net</a>
						</td>
					</tr>
					<tr>
						<td colspan="4">
							&nbsp;
						</td>
					</tr>
					<tr>
						<th>
							${message("admin.index.javaVersion")}:
						</th>
						<td>
							${javaVersion}
						</td>
						<th>
							${message("admin.index.javaHome")}:
						</th>
						<td>
							${javaHome}
						</td>
					</tr>
					<tr>
						<th>
							${message("admin.index.osName")}:
						</th>
						<td>
							${osName}
						</td>
						<th>
							${message("admin.index.osArch")}:
						</th>
						<td>
							${osArch}
						</td>
					</tr>
					<tr>
						<th>
							${message("admin.index.serverInfo")}:
						</th>
						<td>
							<span title="${serverInfo}">${abbreviate(serverInfo, 30, "...")}</span>
						</td>
						<th>
							${message("admin.index.servletVersion")}:
						</th>
						<td>
							${servletVersion}
						</td>
					</tr>
					<tr>
						<td colspan="4">
							&nbsp;
						</td>
					</tr>
					<tr>
						<th>
							${message("admin.index.pendingReviewOrderCount")}:
						</th>
						<td>
							${pendingReviewOrderCount}
						</td>
						<th>
							${message("admin.index.pendingShipmentOrderCount")}:
						</th>
						<td>
							${pendingShipmentOrderCount}
						</td>
					</tr>
					<tr>
						<th>
							${message("admin.index.pendingReceiveOrderCount")}:
						</th>
						<td>
							${pendingReceiveOrderCount}
						</td>
						<th>
							${message("admin.index.pendingRefundsOrderCount")}:
						</th>
						<td>
							${pendingRefundsOrderCount}
						</td>
					</tr>
					<tr>
						<th>
							${message("admin.index.marketableProductCount")}:
						</th>
						<td>
							${marketableSkuCount}
						</td>
						<th>
							${message("admin.index.notMarketableProductCount")}:
						</th>
						<td>
							${notMarketableSkuCount}
						</td>
					</tr>
					<tr>
						<th>
							${message("admin.index.stockAlertProductCount")}:
						</th>
						<td>
							${stockAlertSkuCount}
						</td>
						<th>
							${message("admin.index.outOfStockProductCount")}:
						</th>
						<td>
							${outOfStockSkuCount}
						</td>
					</tr>
					<tr>
						<th>
							${message("admin.index.memberCount")}:
						</th>
						<td>
							${memberCount}
						</td>
						<th>
							${message("admin.index.unreadMessageCount")}:
						</th>
						<td>
							${unreadMessageCount}
						</td>
					</tr>
					<tr>
					</tr>
				</table>
				<iframe id="iframe" name="iframe" frameborder="0"></iframe>
			</td>
		</tr>
	</table>
</body>
</html>