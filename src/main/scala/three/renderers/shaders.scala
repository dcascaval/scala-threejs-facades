package typings.three.renderers.shaders

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
import typings.three.renderers.webgl.*
import typings.three.geometries.*
import typings.three.scenes.*
import typings.three.math.*
import typings.three.math.interpolants.*
import typings.three.audio.*
import typings.three.lights.*


@js.native
trait Shader extends js.Object:
	var uniforms: AnonObject39 = js.native
	var vertexShader: String = js.native
	var fragmentShader: String = js.native
@js.native
@JSGlobal("THREE.ShaderLib")
val ShaderLib: AnonObject40 = js.native
@js.native
@JSGlobal("THREE.ShaderChunk")
val ShaderChunk: AnonObject41 = js.native
@js.native
@JSGlobal("THREE.cloneUniforms")
def cloneUniforms(uniforms_src: js.Any): js.Any = js.native
@js.native
@JSGlobal("THREE.mergeUniforms")
def mergeUniforms(uniforms: js.Array[js.Any]): js.Any = js.native

@js.native
@JSGlobal("THREE.UniformsUtils")
object UniformsUtils extends js.Object

@js.native
trait IUniform[TValue] extends js.Object:
	var value: TValue = js.native
@js.native
@JSGlobal("THREE.UniformsLib")
val UniformsLib: AnonObject42 = js.native

@js.native
trait AnonObject39 extends js.Object:
	@JSBracketAccess
	def apply(uniform: String): IUniform[js.Any] = js.native

@js.native
trait AnonObject40 extends js.Object:
	var basic: Shader = js.native
	var lambert: Shader = js.native
	var phong: Shader = js.native
	var standard: Shader = js.native
	var matcap: Shader = js.native
	var points: Shader = js.native
	var dashed: Shader = js.native
	var depth: Shader = js.native
	var normal: Shader = js.native
	var sprite: Shader = js.native
	var background: Shader = js.native
	var cube: Shader = js.native
	var equirect: Shader = js.native
	var distanceRGBA: Shader = js.native
	var shadow: Shader = js.native
	var physical: Shader = js.native
	@JSBracketAccess
	def apply(name: String): Shader = js.native

@js.native
trait AnonObject42 extends js.Object:
	var common: AnonObject43 = js.native
	var specularmap: AnonObject44 = js.native
	var envmap: AnonObject45 = js.native
	var aomap: AnonObject46 = js.native
	var lightmap: AnonObject47 = js.native
	var emissivemap: AnonObject48 = js.native
	var bumpmap: AnonObject49 = js.native
	var normalmap: AnonObject50 = js.native
	var displacementmap: AnonObject51 = js.native
	var roughnessmap: AnonObject52 = js.native
	var metalnessmap: AnonObject53 = js.native
	var gradientmap: AnonObject54 = js.native
	var fog: AnonObject55 = js.native
	var lights: AnonObject56 = js.native
	var points: AnonObject57 = js.native

@js.native
trait AnonObject38 extends js.Object:
	var enabled: Boolean = js.native

@js.native
trait AnonObject41 extends js.Object:
	var alphamap_fragment: String = js.native
	var alphamap_pars_fragment: String = js.native
	var alphatest_fragment: String = js.native
	var aomap_fragment: String = js.native
	var aomap_pars_fragment: String = js.native
	var begin_vertex: String = js.native
	var beginnormal_vertex: String = js.native
	var bsdfs: String = js.native
	var bumpmap_pars_fragment: String = js.native
	var clipping_planes_fragment: String = js.native
	var clipping_planes_pars_fragment: String = js.native
	var clipping_planes_pars_vertex: String = js.native
	var clipping_planes_vertex: String = js.native
	var color_fragment: String = js.native
	var color_pars_fragment: String = js.native
	var color_pars_vertex: String = js.native
	var color_vertex: String = js.native
	var common: String = js.native
	var cube_frag: String = js.native
	var cube_vert: String = js.native
	var cube_uv_reflection_fragment: String = js.native
	var defaultnormal_vertex: String = js.native
	var depth_frag: String = js.native
	var depth_vert: String = js.native
	var distanceRGBA_frag: String = js.native
	var distanceRGBA_vert: String = js.native
	var displacementmap_vertex: String = js.native
	var displacementmap_pars_vertex: String = js.native
	var emissivemap_fragment: String = js.native
	var emissivemap_pars_fragment: String = js.native
	var encodings_pars_fragment: String = js.native
	var encodings_fragment: String = js.native
	var envmap_fragment: String = js.native
	var envmap_common_pars_fragment: String = js.native
	var envmap_pars_fragment: String = js.native
	var envmap_pars_vertex: String = js.native
	var envmap_vertex: String = js.native
	var equirect_frag: String = js.native
	var equirect_vert: String = js.native
	var fog_fragment: String = js.native
	var fog_pars_fragment: String = js.native
	var linedashed_frag: String = js.native
	var linedashed_vert: String = js.native
	var lightmap_fragment: String = js.native
	var lightmap_pars_fragment: String = js.native
	var lights_lambert_vertex: String = js.native
	var lights_pars_begin: String = js.native
	var envmap_physical_pars_fragment: String = js.native
	var lights_pars_map: String = js.native
	var lights_phong_fragment: String = js.native
	var lights_phong_pars_fragment: String = js.native
	var lights_physical_fragment: String = js.native
	var lights_physical_pars_fragment: String = js.native
	var lights_fragment_begin: String = js.native
	var lights_fragment_maps: String = js.native
	var lights_fragment_end: String = js.native
	var logdepthbuf_fragment: String = js.native
	var logdepthbuf_pars_fragment: String = js.native
	var logdepthbuf_pars_vertex: String = js.native
	var logdepthbuf_vertex: String = js.native
	var map_fragment: String = js.native
	var map_pars_fragment: String = js.native
	var map_particle_fragment: String = js.native
	var map_particle_pars_fragment: String = js.native
	var meshbasic_frag: String = js.native
	var meshbasic_vert: String = js.native
	var meshlambert_frag: String = js.native
	var meshlambert_vert: String = js.native
	var meshphong_frag: String = js.native
	var meshphong_vert: String = js.native
	var meshphysical_frag: String = js.native
	var meshphysical_vert: String = js.native
	var metalnessmap_fragment: String = js.native
	var metalnessmap_pars_fragment: String = js.native
	var morphnormal_vertex: String = js.native
	var morphtarget_pars_vertex: String = js.native
	var morphtarget_vertex: String = js.native
	var normal_flip: String = js.native
	var normal_frag: String = js.native
	var normal_fragment_begin: String = js.native
	var normal_fragment_maps: String = js.native
	var normal_vert: String = js.native
	var normalmap_pars_fragment: String = js.native
	var clearcoat_normal_fragment_begin: String = js.native
	var clearcoat_normal_fragment_maps: String = js.native
	var clearcoat_pars_fragment: String = js.native
	var packing: String = js.native
	var points_frag: String = js.native
	var points_vert: String = js.native
	var shadow_frag: String = js.native
	var shadow_vert: String = js.native
	var premultiplied_alpha_fragment: String = js.native
	var project_vertex: String = js.native
	var roughnessmap_fragment: String = js.native
	var roughnessmap_pars_fragment: String = js.native
	var shadowmap_pars_fragment: String = js.native
	var shadowmap_pars_vertex: String = js.native
	var shadowmap_vertex: String = js.native
	var shadowmask_pars_fragment: String = js.native
	var skinbase_vertex: String = js.native
	var skinning_pars_vertex: String = js.native
	var skinning_vertex: String = js.native
	var skinnormal_vertex: String = js.native
	var specularmap_fragment: String = js.native
	var specularmap_pars_fragment: String = js.native
	var tonemapping_fragment: String = js.native
	var tonemapping_pars_fragment: String = js.native
	var uv2_pars_fragment: String = js.native
	var uv2_pars_vertex: String = js.native
	var uv2_vertex: String = js.native
	var uv_pars_fragment: String = js.native
	var uv_pars_vertex: String = js.native
	var uv_vertex: String = js.native
	var worldpos_vertex: String = js.native
	@JSBracketAccess
	def apply(name: String): String = js.native
