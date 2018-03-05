/*
 * Copyright 2017, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.persistence.db.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

import com.example.android.persistence.model.Product

@Entity(tableName = "products")
class ProductEntity : Product {
    @PrimaryKey
    private var id: Int = 0
    private var name: String? = null
    private var description: String? = null
    private var price: Int = 0

    override fun getId(): Int {
        return id
    }

    fun setId(id: Int) {
        this.id = id
    }

    override fun getName(): String? {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    override fun getDescription(): String? {
        return description
    }

    fun setDescription(description: String) {
        this.description = description
    }

    override fun getPrice(): Int {
        return price
    }

    fun setPrice(price: Int) {
        this.price = price
    }

    constructor() {}

    constructor(id: Int, name: String, description: String, price: Int) {
        this.id = id
        this.name = name
        this.description = description
        this.price = price
    }

    constructor(product: Product) {
        this.id = product.id
        this.name = product.name
        this.description = product.description
        this.price = product.price
    }
}
