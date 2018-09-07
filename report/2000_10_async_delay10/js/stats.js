var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "20000",
        "ok": "20000",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "10002",
        "ok": "10002",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "15507",
        "ok": "15507",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "10383",
        "ok": "10383",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "718",
        "ok": "718",
        "ko": "-"
    },
    "percentiles1": {
        "total": "10066",
        "ok": "10066",
        "ko": "-"
    },
    "percentiles2": {
        "total": "10395",
        "ok": "10395",
        "ko": "-"
    },
    "percentiles3": {
        "total": "12139",
        "ok": "12139",
        "ko": "-"
    },
    "percentiles4": {
        "total": "13271",
        "ok": "13271",
        "ko": "-"
    },
    "group1": {
        "name": "t < 800 ms",
        "count": 0,
        "percentage": 0
    },
    "group2": {
        "name": "800 ms < t < 1200 ms",
        "count": 0,
        "percentage": 0
    },
    "group3": {
        "name": "t > 1200 ms",
        "count": 20000,
        "percentage": 100
    },
    "group4": {
        "name": "failed",
        "count": 0,
        "percentage": 0
    },
    "meanNumberOfRequestsPerSecond": {
        "total": "181.818",
        "ok": "181.818",
        "ko": "-"
    }
},
contents: {
"req_post-api-5024c": {
        type: "REQUEST",
        name: "Post-API",
path: "Post-API",
pathFormatted: "req_post-api-5024c",
stats: {
    "name": "Post-API",
    "numberOfRequests": {
        "total": "20000",
        "ok": "20000",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "10002",
        "ok": "10002",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "15507",
        "ok": "15507",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "10383",
        "ok": "10383",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "718",
        "ok": "718",
        "ko": "-"
    },
    "percentiles1": {
        "total": "10066",
        "ok": "10066",
        "ko": "-"
    },
    "percentiles2": {
        "total": "10395",
        "ok": "10395",
        "ko": "-"
    },
    "percentiles3": {
        "total": "12139",
        "ok": "12139",
        "ko": "-"
    },
    "percentiles4": {
        "total": "13271",
        "ok": "13271",
        "ko": "-"
    },
    "group1": {
        "name": "t < 800 ms",
        "count": 0,
        "percentage": 0
    },
    "group2": {
        "name": "800 ms < t < 1200 ms",
        "count": 0,
        "percentage": 0
    },
    "group3": {
        "name": "t > 1200 ms",
        "count": 20000,
        "percentage": 100
    },
    "group4": {
        "name": "failed",
        "count": 0,
        "percentage": 0
    },
    "meanNumberOfRequestsPerSecond": {
        "total": "181.818",
        "ok": "181.818",
        "ko": "-"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
