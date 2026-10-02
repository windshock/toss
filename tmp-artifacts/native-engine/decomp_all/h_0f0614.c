// entry=0xf0614

void Hf0614(ulong param_1)

{
  ulong in_x5;
  
                    /* WARNING: Could not recover jumptable at 0x001f0954. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00282a58)(*(undefined8 *)((param_1 | in_x5) * 2 - (param_1 ^ in_x5)));
  return;
}


