<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8"/>
    <title>User列表</title>
    <script src="${request.contextPath}/js/jquery.js"></script>
    <script>
        $(function () {
            $('#userimg').click(function () {
                alert('开车');
            });
        });
    </script>
</head>
<body>
whoami<br>
<hr/>
<img id="userimg" src="${request.contextPath}/imgs/cutedog.png" width="300" height="200">
</body>
</html>