package org.engrthoye

import org.junit._
import org.apache.spark
import org.apache.spark.sql._


class AppTest extends TableReader {

  def tableReader(spark: SparkSession): DataFrame = {
    val df = spark.read.parquet(s"C:\\project\\demo2\\src\\test\\resources\\tableserver\\parquet\\Flights.parquet")
    df.show(false)
    df
  }

  @Test
  def testOK: Unit = {

    val DF2 = tableReader(spark)
    DF2.createOrReplaceTempView("DF1")

    spark.sql("SELECT FL_DATE, AIR_TIME FROM DF1").show(false)
    
  }
}

