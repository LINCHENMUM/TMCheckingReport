<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="true"%>

<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.2/themes/smoothness/jquery-ui.css" />
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js"></script>
<script src="<c:url value="/resources/assets/ajax.js"/>"></script>

<html>
<tiles:insertDefinition name="baseLayout">
	<tiles:putAttribute name="body">

		<div class="">
			<div class="container">
				<div class="spacer">
					<div class="row">
						<form:form modelAttribute="checking" action="requestChecking"	method="POST">
							<form:errors path="*" cssClass="errorBlock" element="div" />
							<table class="studentregister">
								<tr>
									<td>Checking Date:</td>
									<td>
<!-- 										<input type="datetime-local" name="checkingDate" placeholder="Date checking" id="checkingDate" required="required" /> -->
									</td>
									<td>
										<form:input type="datetime-local" class="datetime"
													placeholder="MM/dd/yyyy HH:mm" path="checkingDate"
													required="required" pattern="yyyy-MM-dd'T'HH:mm:ss.SSS"  />
									</td>
<!-- 									<td> -->
<%-- 										<form:errors path="checkingDate" cssClass="error" /> --%>
<!-- 									</td> -->
								</tr>
								<tr>
									<td><input type="submit" value="Request"></td>
								</tr>
							</table>
						</form:form>
					</div>
				</div>
			</div>
	</tiles:putAttribute>
</tiles:insertDefinition>
</html>