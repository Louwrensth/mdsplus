public fun BoloHwStartAcq(in _chan_id, in _errors, in _reduction, in _trig_mode)
{
    write(*, "BOLO Start Acquisition");

	Tomo->VmeStartAcq(_chan_id, ref(_errors), val(_reduction), val(_trig_mode) ); 
    

}