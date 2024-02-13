package com.hd.charts.common.model

import com.hd.charts.internal.common.model.ChartDataItem
import com.hd.charts.internal.common.model.MultiChartData
import com.hd.charts.internal.common.model.toChartData

class MultiChartDataSet(
    items: List<Pair<String, List<Float>>>,
    categories: List<String>,
    title: String,
    prefix: String = "",
    postfix: String = ""
) {
    internal val data: MultiChartData

    init {
        val dataItems = items.map {
            ChartDataItem(
                label = it.first,
                item = it.second.toChartData(prefix = prefix, postfix = postfix)
            )
        }

        data = MultiChartData(
            items = dataItems,
            title = title,
            categories = categories
        )
    }
}