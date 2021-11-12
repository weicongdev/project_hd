<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <script src="js/echarts.js"  type="text/javascript"  charset="UTF-8"></script>
    <script src="js/jquery-3.4.1.js"  type="text/javascript"></script>
</head>
<body>
<div id="main" style="width:700px;height:400px;"></div>
<div id="main2" style="width:700px;height:400px;"></div>
<script type="text/javascript">
    $(document).ready(
        function () {
            // 基于准备好的dom，初始化echarts实例
            var myChart = echarts.init(document.getElementById('main'));
            // 指定图表的配置项和数据
            var option = {
                title : {
                    text : '最近7天日平均PV量',
                    subtext: '动态数据'
                },
                tooltip : {},
                legend : {
                    data : [ '日平均PV量' ]
                },
                xAxis : {
                    data : []
                },
                yAxis : {},
                series : [ {
                    name : '日平均PV量',
                    type : 'bar',
                    data : []
                } ]
            };

            // 5.使用刚指定的配置项和数据显示图表。
            //loading 动画
            myChart.setOption(option);
            myChart.showLoading();

            $.ajax({
                url:"${pageContext.request.contextPath}/AvgPvNum",
                type:"get",
                dataType:"json",
                success:function (data) {
                    myChart.setOption({
                        xAxis : {
                            data : data.dates
                        },
                        series : [ {
                            // 根据名字对应到相应的系列
                            name : 'PV量',
                            data : data.data
                        } ]
                    })
                }
            });
            //数据加载完成后再调用 hideLoading 方法隐藏加载动画
            myChart.hideLoading();

        }
    )

</script>
<script type="text/javascript">

    var myChart = echarts.init(document.getElementById('main2'));
    var option = {
        tooltip: {
            trigger: 'axis',
            axisPointer: {
                type: 'shadow'
            }
        },
        legend: {
            data: []
        },
        toolbox: {
            show: true,
            orient: 'vertical',
            right:'5%',
            top: 'center',
            feature: {
                mark: { show: true },
                dataView: { show: true, readOnly: false },
                magicType: { show: true, type: ['line', 'bar', 'stack'] },
                restore: { show: true },
                saveAsImage: { show: true }
            }
        },
        xAxis: [
            {   name:"日期",
                type: 'category',
                axisTick: { show: false },
                data: []
            }
        ],
        yAxis: [
            {   name:'访问量',
                type: 'value'
            }
        ],
        series: [
            {
                name: '',
                type: 'bar',
                barGap: 0,
                emphasis: {
                    focus: 'series'
                },
                data:[]
            },
            {
                name: '',
                type: 'bar',
                emphasis: {
                    focus: 'series'
                },
                data: []
            },
            {
                name: '',
                type: 'bar',
                emphasis: {
                    focus: 'series'
                },
                data: []
            },
            {
                name: '',
                type: 'bar',
                emphasis: {
                    focus: 'series'
                },
                data:[]
            },
            {
                name: '',
                type: 'bar',
                emphasis: {
                    focus: 'series'
                },
                data:[]
            }
        ]
    };
    // 5.使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);
    myChart.showLoading();

    $.ajax({
        url:"${pageContext.request.contextPath}/flowNum",
        type:"get",
        dataType:"json",
        success:function (data) {
            myChart.setOption({
                legend: {
                    data: ['访问量','独立访客量','ip访客量','新独立访客量','访问次数']
                },
                xAxis: [
                    {
                        type: 'category',
                        axisTick: { show: false },
                        data: data.dateStrList
                    }
                ],
                series: [
                    {
                        name:'日期'
                    },
                    {
                        name: '访问量',
                        type: 'bar',
                        barGap: 0,
                        emphasis: {
                            focus: 'series'
                        },
                        data:data.pVNumList
                    },
                    {
                        name: '独立访客量',
                        type: 'bar',
                        emphasis: {
                            focus: 'series'
                        },
                        data: data.uVNumList
                    },
                    {
                        name: 'ip访客量',
                        type: 'bar',
                        emphasis: {
                            focus: 'series'
                        },
                        data: data.iPNumList
                    },
                    {
                        name: '新独立访客量',
                        type: 'bar',
                        emphasis: {
                            focus: 'series'
                        },
                        data:data.newUvNumList
                    },
                    {
                        name: '访问次数',
                        type: 'bar',
                        emphasis: {
                            focus: 'series'
                        },
                        data:data.visitNumList
                    }
                ]
            })
        }
    });
    //数据加载完成后再调用 hideLoading 方法隐藏加载动画
    myChart.hideLoading();
</script>

</body>
</html>