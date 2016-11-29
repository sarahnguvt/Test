package com.mycompany.myapp.stage2.input

import org.tresamigos.smv._

import com.mycompany.myapp.stage1._

object EmploymentStateLink extends SmvModuleLink(EmploymentByState)

/** Can link to a Python module */
object EmploymentStateLink2 extends SmvModuleLink(
  new SmvExtDataSet("com.mycompany.myapp.stage1.employment.PythonEmploymentByState") with SmvOutput)
