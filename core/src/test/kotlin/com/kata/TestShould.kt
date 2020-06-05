package com.kata

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class TestShould {

    @Test
    fun `fail`() {
        Assertions.assertThat(true).isFalse()
    }


    @BeforeEach
    fun beforeEach() {
    }

}
