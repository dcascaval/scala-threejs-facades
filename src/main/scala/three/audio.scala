package typings.three.three.audio

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import org.scalajs.dom.raw.{HTMLMediaElement, HTMLVideoElement, HTMLCanvasElement, HTMLImageElement}
import org.scalajs.dom.raw.{WebGLShader, WebGLFramebuffer}
import org.scalajs.dom.experimental.gamepad.*
import scalajs.js.typedarray.*

import typings.three.three.*
import typings.three.three.helpers.*
import typings.three.three.textures.*
import typings.three.three.objects.*
import typings.three.three.extras.*
import typings.three.three.extras.core.*
import typings.three.three.extras.curves.*
import typings.three.three.extras.objects.*
import typings.three.three.animation.*
import typings.three.three.animation.tracks.*
import typings.three.three.loaders.*
import typings.three.three.cameras.*
import typings.three.three.core.*
import typings.three.three.materials.*
import typings.three.three.renderers.*
import typings.three.three.renderers.webxr.*
import typings.three.three.renderers.shaders.*
import typings.three.three.renderers.webgl.*
import typings.three.three.geometries.*
import typings.three.three.scenes.*
import typings.three.three.math.*
import typings.three.three.math.interpolants.*
import typings.three.three.lights.*


@js.native
@JSGlobal("THREE.AudioListener")
class AudioListener extends Object3D:
	val `type`: String = js.native;
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
	def updateMatrixWorld(force: js.UndefOr[Boolean]): Unit = js.native

@js.native
@JSGlobal("THREE.PositionalAudio")
class PositionalAudio extends Audio[PannerNode]:
	def this(listener: AudioListener) = this()
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
	def updateMatrixWorld(force: js.UndefOr[Boolean]): Unit = js.native

@js.native
@JSGlobal("THREE.Audio")
class Audio[NodeType <: AudioNode] extends Object3D:
	def this(listener: AudioListener) = this()
	val `type`: String = js.native;
	val listener: AudioListener = js.native;
	val context: AudioContext = js.native;
	val gain: GainNode = js.native;
	val autoplay: Boolean = js.native;
	val buffer: Null | AudioBuffer = js.native;
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
	val source: Null | AudioBufferSourceNode = js.native;
	val filters: js.Array[AudioNode] = js.native;
	def getOutput(): NodeType = js.native
	def setNodeSource(audioNode: AudioBufferSourceNode): this.type = js.native
	def setMediaElementSource(mediaElement: HTMLMediaElement): this.type = js.native
	def setMediaStreamSource(mediaStream: MediaStream): this.type = js.native
	def setBuffer(audioBuffer: AudioBuffer): this.type = js.native
	def play(delay: js.UndefOr[Double]): this.type = js.native
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
	def load(file: String): Audio[GainNode] = js.native

@js.native
@JSGlobal("THREE.AudioContext")
object AudioContext extends js.Object:
	def getContext(): AudioContext = js.native
	def setContext(): Unit = js.native

@js.native
@JSGlobal("THREE.AudioAnalyser")
class AudioAnalyser extends js.Object:
	def this(audio: Audio[AudioNode], fftSize: js.UndefOr[Double]) = this()
	val analyser: AnalyserNode = js.native;
	val data: Uint8Array = js.native;
	def getFrequencyData(): Uint8Array = js.native
	def getAverageFrequency(): Double = js.native
	def getData(file: js.Any): js.Any = js.native
