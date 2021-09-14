package typings.three

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import scalajs.js.typedarray.*
 

@js.native  
JSGlobal("THREE")
object animation extends js.Object:
	@js.native
	class AnimationAction extends js.Object:
		val blendMode: AnimationBlendMode = js.native;
		val loop: AnimationActionLoopStyles = js.native;
		val time: Double = js.native;
		val timeScale: Double = js.native;
		val weight: Double = js.native;
		val repetitions: Double = js.native;
		val paused: Boolean = js.native;
		val enabled: Boolean = js.native;
		val clampWhenFinished: Boolean = js.native;
		val zeroSlopeAtStart: Boolean = js.native;
		val zeroSlopeAtEnd: Boolean = js.native;
		def play(): AnimationAction = js.native
		def stop(): AnimationAction = js.native
		def reset(): AnimationAction = js.native
		def isRunning(): Boolean = js.native
		def isScheduled(): Boolean = js.native
		def startAt(time: Double): AnimationAction = js.native
		def setLoop(mode: AnimationActionLoopStyles, repetitions: Double): AnimationAction = js.native
		def setEffectiveWeight(weight: Double): AnimationAction = js.native
		def getEffectiveWeight(): Double = js.native
		def fadeIn(duration: Double): AnimationAction = js.native
		def fadeOut(duration: Double): AnimationAction = js.native
		def crossFadeFrom(fadeOutAction: AnimationAction, duration: Double, warp: Boolean): AnimationAction = js.native
		def crossFadeTo(fadeInAction: AnimationAction, duration: Double, warp: Boolean): AnimationAction = js.native
		def stopFading(): AnimationAction = js.native
		def setEffectiveTimeScale(timeScale: Double): AnimationAction = js.native
		def getEffectiveTimeScale(): Double = js.native
		def setDuration(duration: Double): AnimationAction = js.native
		def syncWith(action: AnimationAction): AnimationAction = js.native
		def halt(duration: Double): AnimationAction = js.native
		def warp(statTimeScale: Double, endTimeScale: Double, duration: Double): AnimationAction = js.native
		def stopWarping(): AnimationAction = js.native
		def getMixer(): AnimationMixer = js.native
		def getClip(): AnimationClip = js.native
		def getRoot(): Object3D = js.native
	
	@js.native
	JSGlobal("THREE")
	object tracks extends js.Object:
		@js.native
		class ColorKeyframeTrack extends js.Object:
			val ValueTypeName: String = js.native;
		@js.native
		class QuaternionKeyframeTrack extends js.Object:
			val ValueTypeName: String = js.native;
		@js.native
		class StringKeyframeTrack extends js.Object:
			val ValueTypeName: String = js.native;
		@js.native
		class BooleanKeyframeTrack extends js.Object:
			val ValueTypeName: String = js.native;
		@js.native
		class NumberKeyframeTrack extends js.Object:
			val ValueTypeName: String = js.native;
		@js.native
		class VectorKeyframeTrack extends js.Object:
			val ValueTypeName: String = js.native;
	@js.native
	class KeyframeTrack extends js.Object:
		val name: String = js.native;
		val times: Float32Array = js.native;
		val values: Float32Array = js.native;
		val ValueTypeName: String = js.native;
		val TimeBufferType: Float32Array = js.native;
		val ValueBufferType: Float32Array = js.native;
		val DefaultInterpolation: InterpolationModes = js.native;
		def InterpolantFactoryMethodDiscrete(result: js.Any): DiscreteInterpolant = js.native
		def InterpolantFactoryMethodLinear(result: js.Any): LinearInterpolant = js.native
		def InterpolantFactoryMethodSmooth(result: js.Any): CubicInterpolant = js.native
		def setInterpolation(interpolation: InterpolationModes): KeyframeTrack = js.native
		def getInterpolation(): InterpolationModes = js.native
		def getValueSize(): Double = js.native
		def shift(timeOffset: Double): KeyframeTrack = js.native
		def scale(timeScale: Double): KeyframeTrack = js.native
		def trim(startTime: Double, endTime: Double): KeyframeTrack = js.native
		def validate(): Boolean = js.native
		def optimize(): KeyframeTrack = js.native
		def clone(): this.type = js.native

	@js.nativetrait ParseTrackNameResults extends js.Object:
		val nodeName: String = js.native;
		val objectName: String = js.native;
		val objectIndex: String = js.native;
		val propertyName: String = js.native;
		val propertyIndex: String = js.native;
	@js.native
	class PropertyBinding extends js.Object:
		val path: String = js.native;
		val parsedPath: js.Any = js.native;
		val node: js.Any = js.native;
		val rootNode: js.Any = js.native;
		val BindingType: objectType18 = js.native;
		val Versioning: objectType19 = js.native;
		val GetterByBindingType: Array[js.Function0[,Unit]] = js.native;
		val SetterByBindingTypeAndVersioning: Array[Array[js.Function0[,Unit]]] = js.native;
		def getValue(targetArray: js.Any, offset: Double): js.Any = js.native
		def setValue(sourceArray: js.Any, offset: Double): Unit = js.native
		def bind(): Unit = js.native
		def unbind(): Unit = js.native




	
	@js.native
	JSGlobal("PropertyBinding")
	object PropertyBinding extends js.Object:
		@js.native
		class Composite extends js.Object:
			def getValue(array: js.Any, offset: Double): js.Any = js.native
			def setValue(array: js.Any, offset: Double): Unit = js.native
			def bind(): Unit = js.native
			def unbind(): Unit = js.native
	
	@js.native
	JSGlobal("AnimationUtils")
	object AnimationUtils extends js.Object:
		def arraySlice(array: js.Any, from: Double, to: Double): js.Any = js.native
		def convertArray(array: js.Any, type: js.Any, forceClone: Boolean): js.Any = js.native
		def isTypedArray(object: js.Any): Boolean = js.native
		def getKeyFrameOrder(times: js.Array[Double]): js.Array[Double] = js.native
		def sortedArray(values: js.Array[js.Any], stride: Double, order: js.Array[Double]): js.Array[js.Any] = js.native
		def flattenJSON(jsonKeys: js.Array[String], times: js.Array[js.Any], values: js.Array[js.Any], valuePropertyName: String): Unit = js.native
		def subclip(sourceClip: AnimationClip, name: String, startFrame: Double, endFrame: Double, fps: js.UndefOr[Double] = js.undefined): AnimationClip = js.native
		def makeClipAdditive(targetClip: AnimationClip, referenceFrame: js.UndefOr[Double] = js.undefined, referenceClip: js.UndefOr[AnimationClip] = js.undefined, fps: js.UndefOr[Double] = js.undefined): AnimationClip = js.native
	@js.native
	class AnimationObjectGroup extends js.Object:
		val uuid: String = js.native;
		val stats: objectType20 = js.native;
		var isAnimationObjectGroup: true = js.native;
		def add(List(), a, r, g, s,  , :,  , (, j, s, ., A, r, r, a, y, [, j, s, ., A, n, y, ], ), *): Unit = js.native
		def remove(List(), a, r, g, s,  , :,  , (, j, s, ., A, r, r, a, y, [, j, s, ., A, n, y, ], ), *): Unit = js.native
		def uncache(List(), a, r, g, s,  , :,  , (, j, s, ., A, r, r, a, y, [, j, s, ., A, n, y, ], ), *): Unit = js.native
	@js.native
	class PropertyMixer extends js.Object:
		val binding: js.Any = js.native;
		val valueSize: Double = js.native;
		val buffer: js.Any = js.native;
		val cumulativeWeight: Double = js.native;
		val cumulativeWeightAdditive: Double = js.native;
		val useCount: Double = js.native;
		val referenceCount: Double = js.native;
		def accumulate(accuIndex: Double, weight: Double): Unit = js.native
		def accumulateAdditive(weight: Double): Unit = js.native
		def apply(accuIndex: Double): Unit = js.native
		def saveOriginalState(): Unit = js.native
		def restoreOriginalState(): Unit = js.native
	@js.nativetrait MorphTarget extends js.Object:
		val name: String = js.native;
		val vertices: js.Array[Vector3] = js.native;
	@js.native
	class AnimationClip extends js.Object:
		val name: String = js.native;
		val tracks: js.Array[KeyframeTrack] = js.native;
		val blendMode: AnimationBlendMode = js.native;
		val duration: Double = js.native;
		val uuid: String = js.native;
		val results: js.Array[js.Any] = js.native;
		def resetDuration(): AnimationClip = js.native
		def trim(): AnimationClip = js.native
		def validate(): Boolean = js.native
		def optimize(): AnimationClip = js.native
		def clone(): this.type = js.native
		def toJSON(clip: AnimationClip): js.Any = js.native






	@js.native
	class AnimationMixer extends js.Object:
		val time: Double = js.native;
		val timeScale: Double = js.native;
		def clipAction(clip: AnimationClip, root: js.UndefOr[Object3D | AnimationObjectGroup] = js.undefined, blendMode: js.UndefOr[AnimationBlendMode] = js.undefined): AnimationAction = js.native
		def existingAction(clip: AnimationClip, root: js.UndefOr[Object3D | AnimationObjectGroup] = js.undefined): AnimationAction | null = js.native
		def stopAllAction(): AnimationMixer = js.native
		def update(deltaTime: Double): AnimationMixer = js.native
		def setTime(timeInSeconds: Double): AnimationMixer = js.native
		def getRoot(): Object3D | AnimationObjectGroup = js.native
		def uncacheClip(clip: AnimationClip): Unit = js.native
		def uncacheRoot(root: Object3D | AnimationObjectGroup): Unit = js.native
		def uncacheAction(clip: AnimationClip, root: js.UndefOr[Object3D | AnimationObjectGroup] = js.undefined): Unit = js.native
