/*
 * Copyright 2011 The Apache Software Foundation
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.codefollower.lealone.test.jdbc.ddl;

import org.junit.Test;

import com.codefollower.lealone.test.jdbc.TestBase;

//TODO 支持LinkedTable
public class CreateLinkedTableTest extends TestBase {
    @Test
    public void run() throws Exception {
        //        stmt.executeUpdate("DROP TABLE IF EXISTS memtable");
        //        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS memtable (f1 int primary key, f2 long) ENGINE memory");
        //        stmt.executeUpdate("INSERT INTO memtable(f1, f2) VALUES(1, 2)");
        //        stmt.executeUpdate("INSERT INTO memtable(f1, f2) VALUES(2, 3)");
        //        stmt.executeUpdate("INSERT INTO memtable(f1, f2) VALUES(3, 4)");
        //
        //        stmt.executeUpdate("DROP TABLE IF EXISTS CreateLinkedTableTest");
        //        stmt.executeUpdate("CREATE LINKED TABLE IF NOT EXISTS CreateLinkedTableTest " //
        //                + "('" + com.codefollower.lealone.Driver.class.getName() + "','" + url + "'," //
        //                + "'sa', '', 'memtable') EMIT UPDATES");
        //
        //        sql = "select * from CreateLinkedTableTest";
        //        executeQuery();

    }
}
