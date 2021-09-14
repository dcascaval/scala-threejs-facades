package typings.three

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import scalajs.js.typedarray.*

@js.native
JSGlobal("THREE")
object audio extends js.Object:
	@js.native
	class AudioListener extends js.Object:
		val type: "AudioListener" = js.native;
		val context: AudioContext = js.native;
		val gain: GainNode = js.native;
		val filter: js.Any = js.native;
		val timeDelta: Double = js.native;
		def getInput(): GainNode = js.native
		def removeFilter(): this.type = js.native
		def setFilter(value: js.Any): this.type = js.native
		def getFilter(): js.Any = js.native
		def setMasterVolume(value: Double): this.type = js.native
		def getMasterVolume(): Double = js.native
		def updateMatrixWorld(force: js.UndefOr[Boolean] = js.undefined): Unit = js.native
	@js.native
	class PositionalAudio extends js.Object:
		val panner: PannerNode = js.native;
		def getOutput(): PannerNode = js.native
		def setRefDistance(value: Double): this.type = js.native
		def getRefDistance(): Double = js.native
		def setRolloffFactor(value: Double): this.type = js.native
		def getRolloffFactor(): Double = js.native
		def setDistanceModel(value: String): this.type = js.native
		def getDistanceModel(): String = js.native
		def setMaxDistance(value: Double): this.type = js.native
		def getMaxDistance(): Double = js.native
		def setDirectionalCone(coneInnerAngle: Double, coneOuterAngle: Double, coneOuterGain: Double): this.type = js.native
		def updateMatrixWorld(force: js.UndefOr[Boolean] = js.undefined): Unit = js.native
	@js.native
	class Audio[NodeType <: AudioNode}] extends js.Object:
		val type: "Audio" = js.native;
		val listener: AudioListener = js.native;
		val context: AudioContext = js.native;
		val gain: GainNode = js.native;
		val autoplay: Boolean = js.native;
		val buffer: null | AudioBuffer = js.native;
		val detune: Double = js.native;
		val loop: Boolean = js.native;
		val loopStart: Double = js.native;
		val loopEnd: Double = js.native;
		val offset: Double = js.native;
		val duration: js.UndefOr[Double] = js.native;
		val playbackRate: Double = js.native;
		val isPlaying: Boolean = js.native;
		val hasPlaybackControl: Boolean = js.native;
		val sourceType: String = js.native;
		val source: null | AudioBufferSourceNode = js.native;
		val filters: js.Array[AudioNode] = js.native;
		def getOutput(): NodeType = js.native
		def setNodeSource(audioNode: AudioBufferSourceNode): this.type = js.native
		def setMediaElementSource(mediaElement: HTMLMediaElement): this.type = js.native
		def setMediaStreamSource(mediaStream: MediaStream): this.type = js.native
		def setBuffer(audioBuffer: AudioBuffer): this.type = js.native
		def play(delay: js.UndefOr[Double] = js.undefined): this.type = js.native
		def onEnded(): Unit = js.native
		def pause(): this.type = js.native
		def stop(): this.type = js.native
		def connect(): this.type = js.native
		def disconnect(): this.type = js.native
		def setDetune(value: Double): this.type = js.native
		def getDetune(): Double = js.native
		def getFilters(): js.Array[AudioNode] = js.native
		def setFilters(value: js.Array[AudioNode]): this.type = js.native
		def getFilter(): AudioNode = js.native
		def setFilter(filter: AudioNode): this.type = js.native
		def setPlaybackRate(value: Double): this.type = js.native
		def getPlaybackRate(): Double = js.native
		def getLoop(): Boolean = js.native
		def setLoop(value: Boolean): this.type = js.native
		def setLoopStart(value: Double): this.type = js.native
		def setLoopEnd(value: Double): this.type = js.native
		def getVolume(): Double = js.native
		def setVolume(value: Double): this.type = js.native
		def load(file: String): Audio = js.native
	
	@js.native
	JSGlobal("AudioContext")
	object AudioContext extends js.Object:
		def getContext(): AudioContext = js.native
		def setContext(): Unit = js.native
	@js.native
	class AudioAnalyser extends js.Object:
		val analyser: AnalyserNode = js.native;
		val data: Uint8Array = js.native;
		def getFrequencyData(): Uint8Array = js.native
		def getAverageFrequency(): Double = js.native
		def getData(file: js.Any): js.Any = js.native
