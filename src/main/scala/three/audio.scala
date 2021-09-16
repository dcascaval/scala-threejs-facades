package typings.three.audio

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import org.scalajs.dom.raw.{HTMLElement, HTMLDocument, HTMLMediaElement, HTMLVideoElement, HTMLCanvasElement, HTMLImageElement}
import org.scalajs.dom.raw.{WebGLShader, WebGLFramebuffer}
import org.scalajs.dom.experimental.gamepad.*
import scalajs.js.typedarray.*

import typings.three.*
import typings.three.helpers.*
import typings.three.textures.*
import typings.three.objects.*
import typings.three.extras.*
import typings.three.extras.core.*
import typings.three.extras.curves.*
import typings.three.extras.objects.*
import typings.three.animation.*
import typings.three.animation.tracks.*
import typings.three.loaders.*
import typings.three.cameras.*
import typings.three.core.*
import typings.three.materials.*
import typings.three.renderers.*
import typings.three.renderers.webxr.*
import typings.three.renderers.shaders.*
import typings.three.renderers.webgl.*
import typings.three.geometries.*
import typings.three.scenes.*
import typings.three.math.*
import typings.three.math.interpolants.*
import typings.three.lights.*


@js.native
@JSGlobal("THREE.AudioListener")
class AudioListener extends Object3D:

	var context: AudioContext = js.native
	var gain: GainNode = js.native
	var filter: js.Any = js.native
	var timeDelta: Double = js.native
	def getInput(): GainNode = js.native
	def removeFilter(): this.type = js.native
	def setFilter(value: js.Any): this.type = js.native
	def getFilter(): js.Any = js.native
	def setMasterVolume(value: Double): this.type = js.native
	def getMasterVolume(): Double = js.native


@js.native
@JSGlobal("THREE.PositionalAudio")
class PositionalAudio extends Audio[PannerNode]:
	def this(listener: AudioListener) = this()
	var panner: PannerNode = js.native

	def setRefDistance(value: Double): this.type = js.native
	def getRefDistance(): Double = js.native
	def setRolloffFactor(value: Double): this.type = js.native
	def getRolloffFactor(): Double = js.native
	def setDistanceModel(value: String): this.type = js.native
	def getDistanceModel(): String = js.native
	def setMaxDistance(value: Double): this.type = js.native
	def getMaxDistance(): Double = js.native
	def setDirectionalCone(coneInnerAngle: Double, coneOuterAngle: Double, coneOuterGain: Double): this.type = js.native


@js.native
@JSGlobal("THREE.Audio")
class Audio[NodeType <: AudioNode] extends Object3D:
	def this(listener: AudioListener) = this()

	var listener: AudioListener = js.native
	var context: AudioContext = js.native
	var gain: GainNode = js.native
	var autoplay: Boolean = js.native
	var buffer: AudioBuffer = js.native
	var detune: Double = js.native
	var loop: Boolean = js.native
	var loopStart: Double = js.native
	var loopEnd: Double = js.native
	var offset: Double = js.native
	var duration: js.UndefOr[Double] = js.native
	var playbackRate: Double = js.native
	var isPlaying: Boolean = js.native
	var hasPlaybackControl: Boolean = js.native
	var sourceType: String = js.native
	var source: AudioBufferSourceNode = js.native
	var filters: js.Array[AudioNode] = js.native
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
	def load(file: String): Audio[GainNode] = js.native

@js.native
@JSGlobal("THREE.AudioContext")
object AudioContext extends js.Object:
	def getContext(): AudioContext = js.native
	def setContext(): Unit = js.native

@js.native
@JSGlobal("THREE.AudioAnalyser")
class AudioAnalyser extends js.Object:
	def this(audio: Audio[AudioNode], fftSize: js.UndefOr[Double] = js.undefined) = this()
	var analyser: AnalyserNode = js.native
	var data: Uint8Array = js.native
	def getFrequencyData(): Uint8Array = js.native
	def getAverageFrequency(): Double = js.native
	def getData(file: js.Any): js.Any = js.native
