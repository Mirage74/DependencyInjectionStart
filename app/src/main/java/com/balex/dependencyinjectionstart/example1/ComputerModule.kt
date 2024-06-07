package com.balex.dependencyinjectionstart.example1

import dagger.Module
import dagger.Provides

@Module
class ComputerModule {
    @Provides
    fun provideMonitor(): Monitor {
        return Monitor()
    }


    @Provides
    fun provideComputer(
        monitor: Monitor,
        computerTower: ComputerTower,
        keyboard: Keyboard,
        mouse: Mouse,
    ): Computer {
        return Computer(monitor, computerTower, keyboard, mouse)
    }

    @Provides
    fun computerTower(
        storage: Storage,
        memory: Memory,
        processor: Processor
    ): ComputerTower {
        return ComputerTower(storage, memory, processor)
    }
    @Provides
    fun storage(): Storage {
        return Storage()
    }
    @Provides
    fun memory(): Memory {
        return Memory()
    }
    @Provides
    fun keyboard(): Keyboard {
        return Keyboard()
    }
    @Provides
    fun processor(): Processor {
        return Processor()
    }
    @Provides
    fun mouse(): Mouse {
        return Mouse()
    }
}