package org.engrthoye

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.udf

trait TableReader {

  val spark :SparkSession = SparkSession
    .builder()
    .master("local[4]")
    .appName("test")
    .config("spark.ui.enable", "true")
//    .config("spark.app.id", appID)
    .getOrCreate()

//  val uuid = udf(() => java.util.UUID.randomUUID().toString)
//
//  def appID: String = (this.getClass.getName + math.floor(math.random() * 10e4).toLong.toString)
//  spark.sqlContext.udf.register("uuid", uuid)
}
