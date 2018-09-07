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
        "total": "2010",
        "ok": "2010",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "21434",
        "ok": "21434",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "19430",
        "ok": "19430",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "3561",
        "ok": "3561",
        "ko": "-"
    },
    "percentiles1": {
        "total": "20379",
        "ok": "20379",
        "ko": "-"
    },
    "percentiles2": {
        "total": "20700",
        "ok": "20700",
        "ko": "-"
    },
    "percentiles3": {
        "total": "20934",
        "ok": "20934",
        "ko": "-"
    },
    "percentiles4": {
        "total": "21000",
        "ok": "21000",
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
        "total": "96.618",
        "ok": "96.618",
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
        "total": "2010",
        "ok": "2010",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "21434",
        "ok": "21434",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "19430",
        "ok": "19430",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "3561",
        "ok": "3561",
        "ko": "-"
    },
    "percentiles1": {
        "total": "20379",
        "ok": "20379",
        "ko": "-"
    },
    "percentiles2": {
        "total": "20700",
        "ok": "20700",
        "ko": "-"
    },
    "percentiles3": {
        "total": "20934",
        "ok": "20934",
        "ko": "-"
    },
    "percentiles4": {
        "total": "21000",
        "ok": "21000",
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
        "total": "96.618",
        "ok": "96.618",
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
